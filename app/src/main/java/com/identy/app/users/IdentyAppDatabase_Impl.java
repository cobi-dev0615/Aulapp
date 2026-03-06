package com.identy.app.users;

import android.os.Process;
import android.os.SystemClock;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public final class IdentyAppDatabase_Impl extends IdentyAppDatabase {
    private static final byte[] $$a = {18, -90, 23, -81, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27};
    private static final int $$b = 95;
    private volatile UserDao a;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `IdentyUser` (`uid` INTEGER NOT NULL, `username` TEXT, `email` TEXT, `unique_id` TEXT, PRIMARY KEY(`uid`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4b2d8ee6a4fbaaf2785ce5abd971486d\")");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `IdentyUser`");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (IdentyAppDatabase_Impl.a(IdentyAppDatabase_Impl.this) != null) {
                int size = IdentyAppDatabase_Impl.b(IdentyAppDatabase_Impl.this).size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) IdentyAppDatabase_Impl.c(IdentyAppDatabase_Impl.this).get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            IdentyAppDatabase_Impl.a(IdentyAppDatabase_Impl.this, supportSQLiteDatabase);
            IdentyAppDatabase_Impl.b(IdentyAppDatabase_Impl.this, supportSQLiteDatabase);
            if (IdentyAppDatabase_Impl.d(IdentyAppDatabase_Impl.this) != null) {
                int size = IdentyAppDatabase_Impl.e(IdentyAppDatabase_Impl.this).size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) IdentyAppDatabase_Impl.f(IdentyAppDatabase_Impl.this).get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1));
            hashMap.put("username", new TableInfo.Column("username", "TEXT", false, 0));
            hashMap.put("email", new TableInfo.Column("email", "TEXT", false, 0));
            hashMap.put("unique_id", new TableInfo.Column("unique_id", "TEXT", false, 0));
            TableInfo tableInfo = new TableInfo("IdentyUser", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase, "IdentyUser");
            if (tableInfo.equals(read)) {
                return;
            }
            StringBuilder sb = new StringBuilder("Migration didn't properly handle IdentyUser(com.identy.app.users.IdentyUser).\n Expected:\n");
            sb.append(tableInfo);
            sb.append("\n Found:\n");
            sb.append(read);
            throw new IllegalStateException(sb.toString());
        }
    }

    public IdentyAppDatabase_Impl() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = defpackage.a.c((~(maxMemory | 135246075)) | 633340672, 116, ((634135355 | maxMemory) * 116) + (((~((~maxMemory) | (-134451393))) * (-116)) - 1537692237), -1370901604);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4930;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            g(bArr[75], bArr[27], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g(bArr[19], bArr[32], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1370901604);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4930;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ List a(IdentyAppDatabase_Impl identyAppDatabase_Impl) {
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
                    int i = ~elapsedRealtime;
                    int c = defpackage.a.c((~(i | (-514528994))) | 4497408, 564, ((~(elapsedRealtime | (-11142306))) * 1128) + (((~(15639713 | i)) | (-514528994) | (~((-15639714) | elapsedRealtime))) * (-564)) + 2131449251, -1621578265);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4930;
                    Fpnative.valueOf = objArr;
                    return identyAppDatabase_Impl.mCallbacks;
                }
            }
            Object[] objArr3 = new Object[1];
            g($$a[2], (short) ($$a[54] + 1), $$a[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g($$a[17], (short) ($$b & 505), $$a[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1621578265);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4930;
            Fpnative.valueOf = objArr;
            return identyAppDatabase_Impl.mCallbacks;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ List b(IdentyAppDatabase_Impl identyAppDatabase_Impl) {
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
                    int c = defpackage.a.c((~((~elapsedRealtime) | 261041012)) | 759930292, 217, (((~(elapsedRealtime | (-759930293))) | 541103232) * 217) + ((((~((-759930293) | 0)) | (~(261041012 | elapsedRealtime))) * 217) - 2082017980), 1558105787);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5009;
                    Fpnative.valueOf = objArr;
                    return identyAppDatabase_Impl.mCallbacks;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[26];
            Object[] objArr3 = new Object[1];
            g(b, (short) (b << 2), bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[27];
            Object[] objArr4 = new Object[1];
            g(b2, (short) (b2 | 135), bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1558105787);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5009;
            Fpnative.valueOf = objArr;
            return identyAppDatabase_Impl.mCallbacks;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ List c(IdentyAppDatabase_Impl identyAppDatabase_Impl) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int c = defpackage.a.c((~(myPid | (-383295602))) | (~(i | 115593678)), 959, (((~((-383295602) | i)) | (~(myPid | 115593678))) * 959) + 1470783841, -275983974);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5027;
                    Fpnative.valueOf = objArr;
                    return identyAppDatabase_Impl.mCallbacks;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            g(bArr[75], bArr[27], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g(bArr[19], bArr[32], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -275983974);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5027;
            Fpnative.valueOf = objArr;
            return identyAppDatabase_Impl.mCallbacks;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ List d(IdentyAppDatabase_Impl identyAppDatabase_Impl) {
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
                    int c = defpackage.a.c(elapsedRealtime | (-28591127), 465, (((-66577431) | (~((-565466711) | elapsedRealtime))) * 930) + (((~(elapsedRealtime | (-66577431))) | (-565466711)) * (-465)) + 1337342871, -833093475);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4971;
                    Fpnative.valueOf = objArr;
                    return identyAppDatabase_Impl.mCallbacks;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            g(bArr[75], bArr[27], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g(bArr[19], bArr[32], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -833093475);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4971;
            Fpnative.valueOf = objArr;
            return identyAppDatabase_Impl.mCallbacks;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ List e(IdentyAppDatabase_Impl identyAppDatabase_Impl) {
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
                    int i = ~myUid;
                    int c = defpackage.a.c((~(i | 1005276672)) | (~(506387392 | i)), 865, ((~(myUid | 1005276672)) * 865) + ((((~((-1005276673) | i)) | 506387392) * (-865)) - 1876719776), 1370698847);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4952;
                    Fpnative.valueOf = objArr;
                    return identyAppDatabase_Impl.mCallbacks;
                }
            }
            Object[] objArr3 = new Object[1];
            g($$a[2], (short) ($$a[54] + 1), $$a[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g($$a[17], (short) ($$b & 505), $$a[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1370698847);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4952;
            Fpnative.valueOf = objArr;
            return identyAppDatabase_Impl.mCallbacks;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ List f(IdentyAppDatabase_Impl identyAppDatabase_Impl) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = defpackage.a.c((~((~maxMemory) | (-227585149))) | 150998076, 560, ((~(maxMemory | 803061500)) * (-560)) + (((~(726474428 | 0)) * (-560)) - 1198529137), -2031914957);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4918;
                    Fpnative.valueOf = objArr;
                    return identyAppDatabase_Impl.mCallbacks;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[26];
            Object[] objArr3 = new Object[1];
            g(b, (short) (b << 2), bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[27];
            Object[] objArr4 = new Object[1];
            g(b2, (short) (b2 | 135), bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2031914957);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4918;
            Fpnative.valueOf = objArr;
            return identyAppDatabase_Impl.mCallbacks;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(byte b, short s, short s2, Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (s2 * 19) + 80;
        int r6 = s + 4;
        byte[] bArr2 = new byte[b + 6];
        int i4 = b + 5;
        if (bArr == null) {
            byte b2 = 0;
            i = 0;
            int i5 = 0;
            i3 = (i3 + b2) - 13;
            i2 = i5 + 1;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            b2 = bArr[i2];
            i5 = i2;
            i3 = (i3 + b2) - 13;
            i2 = i5 + 1;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // androidx.room.RoomDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clearAllTables() {
        Object[] objArr;
        long j;
        SupportSQLiteDatabase writableDatabase;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int i = ~identityHashCode;
                        int c = defpackage.a.c((~(367862163 | i)) | (-131027117), 712, (((~(identityHashCode | 401568191)) | (~(i | (-33706029)))) * (-712)) + (((33706028 | 0) * (-712)) - 623939641), 901506480);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 4898;
                        Fpnative.valueOf = objArr;
                        super.assertNotMainThread();
                        writableDatabase = super.getOpenHelper().getWritableDatabase();
                        super.beginTransaction();
                        writableDatabase.execSQL("DELETE FROM `IdentyUser`");
                        super.setTransactionSuccessful();
                        super.endTransaction();
                        int i4 = ((int[]) objArr[1])[0];
                        int i5 = i4 * i4;
                        int i6 = -(983855667 * i4);
                        int i7 = (((i5 ^ i6) + ((i5 & i6) << 1)) - (~(-(i4 * (-1748399385))))) - (-177740200);
                        int i8 = i7 >> 24;
                        int e = IdentyB.e((i8 | (-511)) << 1, i8 ^ (-511), 256, -1);
                        int i9 = ((i7 | e) << 1) - (e ^ i7);
                        int i10 = ((i7 >> 23) - 1023) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                        int i11 = (-(i9 ^ ((i10 & 1) + (i10 | 1)))) + 3;
                        int i12 = i11 >> 28;
                        int a2 = IdentyB.a(i12 ^ (-31), (i12 & (-31)) << 1, 16, -1);
                        writableDatabase.query("2|22|13|PRAGMA wal_checkpoint(FULL)".substring(38664 / ((i11 & (-(((a2 | 1) << 1) - (a2 ^ 1)))) * 1611))).close();
                        if (writableDatabase.inTransaction()) {
                            writableDatabase.execSQL("VACUUM");
                            return;
                        }
                        return;
                    }
                }
                super.beginTransaction();
                writableDatabase.execSQL("DELETE FROM `IdentyUser`");
                super.setTransactionSuccessful();
                super.endTransaction();
                int i42 = ((int[]) objArr[1])[0];
                int i52 = i42 * i42;
                int i62 = -(983855667 * i42);
                int i72 = (((i52 ^ i62) + ((i52 & i62) << 1)) - (~(-(i42 * (-1748399385))))) - (-177740200);
                int i82 = i72 >> 24;
                int e2 = IdentyB.e((i82 | (-511)) << 1, i82 ^ (-511), 256, -1);
                int i92 = ((i72 | e2) << 1) - (e2 ^ i72);
                int i102 = ((i72 >> 23) - 1023) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                int i112 = (-(i92 ^ ((i102 & 1) + (i102 | 1)))) + 3;
                int i122 = i112 >> 28;
                int a22 = IdentyB.a(i122 ^ (-31), (i122 & (-31)) << 1, 16, -1);
                writableDatabase.query("2|22|13|PRAGMA wal_checkpoint(FULL)".substring(38664 / ((i112 & (-(((a22 | 1) << 1) - (a22 ^ 1)))) * 1611))).close();
                if (writableDatabase.inTransaction()) {
                }
            } catch (Throwable th) {
                super.endTransaction();
                writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
                if (!writableDatabase.inTransaction()) {
                    writableDatabase.execSQL("VACUUM");
                }
                throw th;
            }
            byte[] bArr = $$a;
            byte b = bArr[26];
            Object[] objArr3 = new Object[1];
            g(b, (short) (b << 2), bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[27];
            Object[] objArr4 = new Object[1];
            g(b2, (short) (b2 | 135), bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 901506480);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4898;
            Fpnative.valueOf = objArr;
            super.assertNotMainThread();
            writableDatabase = super.getOpenHelper().getWritableDatabase();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
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
                    int c = defpackage.a.c((~((~identityHashCode) | 52378956)) | (-446510324), 168, (((~(identityHashCode | 52378956)) | (-463420928)) * (-168)) + ((((~((-446510324) | identityHashCode)) | 35468352) * 336) - 1710130969), 491737148);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4922;
                    Fpnative.valueOf = objArr;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((((i3 * i3) - (~(-(900743446 * i3)))) - 1) - (~(-(i3 * 570011868)))) - 1;
                    int i5 = ((i4 | (-192191951)) << 1) - ((-192191951) ^ i4);
                    int i6 = i5 >> 22;
                    int i7 = ((i6 & (-2047)) + (i6 | (-2047))) / 1024;
                    int i8 = (i7 & 1) + (i7 | 1);
                    int i9 = (i5 & i8) + (i8 | i5);
                    int i10 = i5 >> 25;
                    int i11 = ((i10 & (-255)) + (i10 | (-255))) / 128;
                    int i12 = (-(((i11 & 1) + (i11 | 1)) ^ i9)) + 7;
                    int i13 = i12 >> 24;
                    String[] strArr = new String[12922 / ((i12 & (-IdentyB.a(i13 ^ (-511), (i13 & (-511)) << 1, 256, -2))) * 1846)];
                    strArr[0] = "IdentyUser";
                    return new InvalidationTracker(this, strArr);
                }
            }
            Object[] objArr3 = new Object[1];
            g($$a[2], (short) ($$a[54] + 1), $$a[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g($$a[17], (short) ($$b & 505), $$a[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 491737148);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4922;
            Fpnative.valueOf = objArr;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = ((((i32 * i32) - (~(-(900743446 * i32)))) - 1) - (~(-(i32 * 570011868)))) - 1;
            int i52 = ((i42 | (-192191951)) << 1) - ((-192191951) ^ i42);
            int i62 = i52 >> 22;
            int i72 = ((i62 & (-2047)) + (i62 | (-2047))) / 1024;
            int i82 = (i72 & 1) + (i72 | 1);
            int i92 = (i52 & i82) + (i82 | i52);
            int i102 = i52 >> 25;
            int i112 = ((i102 & (-255)) + (i102 | (-255))) / 128;
            int i122 = (-(((i112 & 1) + (i112 | 1)) ^ i92)) + 7;
            int i132 = i122 >> 24;
            String[] strArr2 = new String[12922 / ((i122 & (-IdentyB.a(i132 ^ (-511), (i132 & (-511)) << 1, 256, -2))) * 1846)];
            strArr2[0] = "IdentyUser";
            return new InvalidationTracker(this, strArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~System.identityHashCode(this);
                    int c = defpackage.a.c((~(i | (-161559171))) | 161480706, 983, (((~((-337330110) | i)) | (-161559171)) * (-983)) + 778270092, -1812620833);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4969;
                    Fpnative.valueOf = objArr;
                    a aVar = new a(3);
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(213041308 * i4);
                    int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                    int i8 = -(i4 * (-547641104));
                    int i9 = ((i7 & i8) + (i8 | i7)) - (-1974798628);
                    int i10 = i9 >> 22;
                    int a2 = IdentyB.a(i10 ^ (-2047), (i10 & (-2047)) << 1, 1024, -1);
                    int i11 = ((i9 | a2) << 1) - (a2 ^ i9);
                    int i12 = i9 >> 16;
                    int i13 = -(IdentyB.a(i12 & (-131071), i12 | (-131071), 65536, -1) ^ i11);
                    int i14 = ((i13 | 9) << 1) - (i13 ^ 9);
                    int i15 = i14 >> 27;
                    int i16 = (((i15 | (-63)) << 1) - (i15 ^ (-63))) / 32;
                    int i17 = (i16 & 1) + (i16 | 1);
                    return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, aVar, IdentyB.c((-((i17 ^ 1) + ((i17 & 1) << 1))) & i14, 391, 42228, "17\\19\\13\\11\\4b2d8ee6a4fbaaf2785ce5abd971486d"), "e2b606b641a43e3109ad37a6a1230d18")).build());
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            g(bArr[75], bArr[27], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g(bArr[19], bArr[32], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1812620833);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4969;
            Fpnative.valueOf = objArr;
            a aVar2 = new a(3);
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(213041308 * i42);
            int i72 = ((i52 | i62) << 1) - (i52 ^ i62);
            int i82 = -(i42 * (-547641104));
            int i92 = ((i72 & i82) + (i82 | i72)) - (-1974798628);
            int i102 = i92 >> 22;
            int a22 = IdentyB.a(i102 ^ (-2047), (i102 & (-2047)) << 1, 1024, -1);
            int i112 = ((i92 | a22) << 1) - (a22 ^ i92);
            int i122 = i92 >> 16;
            int i132 = -(IdentyB.a(i122 & (-131071), i122 | (-131071), 65536, -1) ^ i112);
            int i142 = ((i132 | 9) << 1) - (i132 ^ 9);
            int i152 = i142 >> 27;
            int i162 = (((i152 | (-63)) << 1) - (i152 ^ (-63))) / 32;
            int i172 = (i162 & 1) + (i162 | 1);
            return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, aVar2, IdentyB.c((-((i172 ^ 1) + ((i172 & 1) << 1))) & i142, 391, 42228, "17\\19\\13\\11\\4b2d8ee6a4fbaaf2785ce5abd971486d"), "e2b606b641a43e3109ad37a6a1230d18")).build());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d8  */
    @Override // com.identy.app.users.IdentyAppDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UserDao userDao() {
        Object[] objArr;
        long j;
        UserDao userDao;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = defpackage.a.b(1725384588);
                    int c = defpackage.a.c((~(b | (-219758746))) | (-279130535), 502, ((~((~b) | (-279064871))) * (-502)) + (((~((-279130535) | b)) | (-498823616)) * (-502)) + 238756285, -1417116096);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5019;
                    Fpnative.valueOf = objArr;
                    if (this.a == null) {
                        return this.a;
                    }
                    synchronized (this) {
                        try {
                            if (this.a == null) {
                                this.a = new UserDao_Impl(this);
                            }
                            userDao = this.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return userDao;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            g(bArr[75], bArr[27], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g(bArr[19], bArr[32], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1417116096);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5019;
            Fpnative.valueOf = objArr;
            if (this.a == null) {
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static /* synthetic */ void b(IdentyAppDatabase_Impl identyAppDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
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
                    int c = defpackage.a.c((~(elapsedRealtime | (-257256639))) | 239404160 | (~((~elapsedRealtime) | 259485119)), 164, ((241632641 | elapsedRealtime) * 164) + ((((~(257256638 | 0)) | 241632641) * (-328)) - 2063446229), -1468239307);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4922;
                    Fpnative.valueOf = objArr;
                    identyAppDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[26];
            Object[] objArr3 = new Object[1];
            g(b, (short) (b << 2), bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[27];
            Object[] objArr4 = new Object[1];
            g(b2, (short) (b2 | 135), bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1468239307);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4922;
            Fpnative.valueOf = objArr;
            identyAppDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ SupportSQLiteDatabase a(IdentyAppDatabase_Impl identyAppDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i = ~startUptimeMillis;
                    int c = defpackage.a.c((~(startUptimeMillis | 273444745)) | (~(i | 225444534)), 950, (((~(i | 273444745)) | (~(startUptimeMillis | 225444534))) * (-950)) + ((((~((-225444535) | i)) | (~((-273444746) | startUptimeMillis))) * 1900) - 999523211), -1136444667);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4961;
                    Fpnative.valueOf = objArr;
                    identyAppDatabase_Impl.mDatabase = supportSQLiteDatabase;
                    return supportSQLiteDatabase;
                }
            }
            Object[] objArr3 = new Object[1];
            g($$a[2], (short) ($$a[54] + 1), $$a[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            g($$a[17], (short) ($$b & 505), $$a[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1136444667);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4961;
            Fpnative.valueOf = objArr;
            identyAppDatabase_Impl.mDatabase = supportSQLiteDatabase;
            return supportSQLiteDatabase;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
