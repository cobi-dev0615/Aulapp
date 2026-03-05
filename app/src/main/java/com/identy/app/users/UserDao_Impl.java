package com.identy.app.users;

import android.database.Cursor;
import android.os.Process;
import android.os.SystemClock;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.d.e.a.values;
import com.identy.Fpnative;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public final class UserDao_Impl implements UserDao {
    private static final byte[] $$a = {73, -60, 64, 55, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
    private static final int $$b = 188;
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;
    private final EntityDeletionOrUpdateAdapter c;

    public class a extends EntityInsertionAdapter {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `IdentyUser`(`uid`,`username`,`email`,`unique_id`) VALUES (?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public void bind(SupportSQLiteStatement supportSQLiteStatement, IdentyUser identyUser) {
            supportSQLiteStatement.bindLong(1, identyUser.uid);
            String str = identyUser.username;
            if (str == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str);
            }
            String str2 = identyUser.email;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = identyUser.uniqueId;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `IdentyUser` WHERE `uid` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public void bind(SupportSQLiteStatement supportSQLiteStatement, IdentyUser identyUser) {
            supportSQLiteStatement.bindLong(1, identyUser.uid);
        }
    }

    public UserDao_Impl(RoomDatabase roomDatabase) {
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
                    int i = (((-633638465) | startElapsedRealtime) * 614) + 1466956421;
                    int i2 = ~startElapsedRealtime;
                    int c = defpackage.a.c((~(i2 | (-67374593))) | (~((-566263873) | i2)), 614, (((~((-1005699529) | i2)) | 439435656 | (~((-506810249) | i2))) * (-1228)) + i, 1273110864);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4922;
                    Fpnative.valueOf = objArr;
                    this.a = roomDatabase;
                    this.b = new a(roomDatabase);
                    this.c = new b(roomDatabase);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) (-bArr[16]), (byte) 122, (byte) 23, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            d(b2, (byte) (b2 | 94), bArr[19], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1273110864);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4922;
            Fpnative.valueOf = objArr;
            this.a = roomDatabase;
            this.b = new a(roomDatabase);
            this.c = new b(roomDatabase);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void d(int i, int i2, int i3, Object[] objArr) {
        int i4 = 125 - i2;
        int i5 = (i * 19) + 80;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 6];
        int i6 = i3 + 5;
        int i7 = -1;
        if (bArr == null) {
            i5 = (i6 + (-i4)) - 13;
            i4 = i4;
            bArr = bArr;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i4 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i5 = (i5 + (-bArr[i9])) - 13;
            i4 = i9;
            bArr = bArr3;
            i7 = i8;
        }
    }

    @Override // com.identy.app.users.UserDao
    public final void delete(IdentyUser identyUser) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int c = defpackage.a.c((~(identityHashCode | 1027229345)) | (-575115969), 70, ((~((-38113345) | identityHashCode)) * 70) + (((~((-528340066) | identityHashCode)) | 490226721) * (-140)) + 2014565649, 829082499);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4851;
                        Fpnative.valueOf = objArr;
                        this.a.beginTransaction();
                        this.c.handle(identyUser);
                        this.a.setTransactionSuccessful();
                        return;
                    }
                }
                this.c.handle(identyUser);
                this.a.setTransactionSuccessful();
                return;
            } finally {
                this.a.endTransaction();
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) (-bArr[16]), bArr[99], (byte) (-bArr[14]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            d(b2, b2, (byte) (-bArr[98]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 829082499);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4851;
            Fpnative.valueOf = objArr;
            this.a.beginTransaction();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x016d A[Catch: all -> 0x018e, LOOP:0: B:12:0x0167->B:14:0x016d, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x018e, blocks: (B:11:0x00e0, B:12:0x0167, B:14:0x016d), top: B:10:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d3  */
    @Override // com.identy.app.users.UserDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<IdentyUser> findByEmail(String str) {
        Object[] objArr;
        long j;
        RoomSQLiteQuery acquire;
        Cursor query;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int i = (~(324790772 | identityHashCode)) | 536876032;
                        int c = defpackage.a.c((~(identityHashCode | 861666804)) | (~((~identityHashCode) | (-37986753))), 470, ((i | r7) * (-470)) - 572446145, 823122063);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 5003;
                        Fpnative.valueOf = objArr;
                        acquire = RoomSQLiteQuery.acquire("SELECT * FROM IdentyUser WHERE email LIKE ? ", 1);
                        if (str != null) {
                            acquire.bindNull(1);
                        } else {
                            acquire.bindString(1, str);
                        }
                        query = this.a.query(acquire);
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("uid");
                        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("username");
                        int i4 = ((int[]) objArr[1])[0];
                        int i5 = i4 * i4;
                        int i6 = -(598527833 * i4);
                        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                        int i8 = -(i4 * 1185203119);
                        int i9 = (i7 & i8) + (i8 | i7);
                        int i10 = ((i9 | 1071680528) << 1) - (1071680528 ^ i9);
                        int i11 = i10 >> 29;
                        int i12 = (((i11 ^ (-15)) + ((i11 & (-15)) << 1)) / 8) + 1;
                        int i13 = (i10 ^ i12) + ((i12 & i10) << 1);
                        int i14 = i10 >> 19;
                        int i15 = ((i14 & (-16383)) + (i14 | (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                        int i16 = -(((i15 ^ 1) + ((i15 & 1) << 1)) ^ i13);
                        int i17 = ((i16 | 7) << 1) - (i16 ^ 7);
                        int i18 = ((i17 >> 22) - 2047) / 1024;
                        int i19 = (i18 ^ 1) + ((i18 & 1) << 1);
                        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("9/4/6/email".substring(54684 / (((-(((i19 | 1) << 1) - (i19 ^ 1))) & i17) * 1302)));
                        int columnIndexOrThrow4 = query.getColumnIndexOrThrow("unique_id");
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            IdentyUser identyUser = new IdentyUser();
                            identyUser.uid = query.getInt(columnIndexOrThrow);
                            identyUser.username = query.getString(columnIndexOrThrow2);
                            identyUser.email = query.getString(columnIndexOrThrow3);
                            identyUser.uniqueId = query.getString(columnIndexOrThrow4);
                            arrayList.add(identyUser);
                        }
                        return arrayList;
                    }
                }
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("uid");
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("username");
                int i42 = ((int[]) objArr[1])[0];
                int i52 = i42 * i42;
                int i62 = -(598527833 * i42);
                int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
                int i82 = -(i42 * 1185203119);
                int i92 = (i72 & i82) + (i82 | i72);
                int i102 = ((i92 | 1071680528) << 1) - (1071680528 ^ i92);
                int i112 = i102 >> 29;
                int i122 = (((i112 ^ (-15)) + ((i112 & (-15)) << 1)) / 8) + 1;
                int i132 = (i102 ^ i122) + ((i122 & i102) << 1);
                int i142 = i102 >> 19;
                int i152 = ((i142 & (-16383)) + (i142 | (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                int i162 = -(((i152 ^ 1) + ((i152 & 1) << 1)) ^ i132);
                int i172 = ((i162 | 7) << 1) - (i162 ^ 7);
                int i182 = ((i172 >> 22) - 2047) / 1024;
                int i192 = (i182 ^ 1) + ((i182 & 1) << 1);
                int columnIndexOrThrow32 = query.getColumnIndexOrThrow("9/4/6/email".substring(54684 / (((-(((i192 | 1) << 1) - (i192 ^ 1))) & i172) * 1302)));
                int columnIndexOrThrow42 = query.getColumnIndexOrThrow("unique_id");
                ArrayList arrayList2 = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                }
                return arrayList2;
            } finally {
                query.close();
                acquire.release();
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) (-bArr[16]), (byte) 122, (byte) 23, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            d(b2, (byte) (b2 | 94), bArr[19], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 823122063);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5003;
            Fpnative.valueOf = objArr;
            acquire = RoomSQLiteQuery.acquire("SELECT * FROM IdentyUser WHERE email LIKE ? ", 1);
            if (str != null) {
            }
            query = this.a.query(acquire);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x015b A[Catch: all -> 0x0179, TRY_LEAVE, TryCatch #1 {all -> 0x0179, blocks: (B:11:0x013d, B:13:0x015b), top: B:10:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0130  */
    @Override // com.identy.app.users.UserDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentyUser findByName(String str) {
        Object[] objArr;
        long j;
        RoomSQLiteQuery acquire;
        Cursor query;
        Object[] objArr2 = Fpnative.valueOf;
        IdentyUser identyUser = null;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int c = defpackage.a.c((~(System.identityHashCode(this) | 805175161)) | 204556601, 366, (((~(255421241 | r0)) | 754310521) * (-366)) - 154638913, -1781998909);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4973;
                        Fpnative.valueOf = objArr;
                        acquire = RoomSQLiteQuery.acquire("SELECT * FROM IdentyUser WHERE username LIKE ? ", 1);
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = i3 * i3;
                        int i5 = -(2093762988 * i3);
                        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                        int i7 = -(i3 * 1077787252);
                        int i8 = ((i6 & i7) + (i7 | i6)) - 458997504;
                        int i9 = i8 >> 22;
                        int i10 = (i8 - (~com.identy.IdentyB.a(i9 ^ (-2047), (i9 & (-2047)) << 1, 1024, -1))) - 1;
                        int i11 = i8 >> 15;
                        int i12 = (((i11 | (-262143)) << 1) - (i11 ^ (-262143))) / 131072;
                        int i13 = (-(i10 ^ ((i12 ^ 1) + ((i12 & 1) << 1)))) + 6;
                        int e = com.identy.IdentyB.e(i13 >> 21, 4095, 2048, -1);
                        int i14 = 1356 / ((i13 & (-((e & 1) + (1 | e)))) * 226);
                        if (str != null) {
                            acquire.bindNull(i14);
                        } else {
                            acquire.bindString(i14, str);
                        }
                        query = this.a.query(acquire);
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("uid");
                        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("username");
                        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("email");
                        int columnIndexOrThrow4 = query.getColumnIndexOrThrow("unique_id");
                        if (query.moveToFirst()) {
                            identyUser = new IdentyUser();
                            identyUser.uid = query.getInt(columnIndexOrThrow);
                            identyUser.username = query.getString(columnIndexOrThrow2);
                            identyUser.email = query.getString(columnIndexOrThrow3);
                            identyUser.uniqueId = query.getString(columnIndexOrThrow4);
                        }
                        return identyUser;
                    }
                }
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("uid");
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("username");
                int columnIndexOrThrow32 = query.getColumnIndexOrThrow("email");
                int columnIndexOrThrow42 = query.getColumnIndexOrThrow("unique_id");
                if (query.moveToFirst()) {
                }
                return identyUser;
            } finally {
                query.close();
                acquire.release();
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) (-bArr[16]), bArr[99], (byte) (-bArr[14]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            d(b2, b2, (byte) (-bArr[98]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1781998909);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4973;
            Fpnative.valueOf = objArr;
            acquire = RoomSQLiteQuery.acquire("SELECT * FROM IdentyUser WHERE username LIKE ? ", 1);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(2093762988 * i32);
            int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
            int i72 = -(i32 * 1077787252);
            int i82 = ((i62 & i72) + (i72 | i62)) - 458997504;
            int i92 = i82 >> 22;
            int i102 = (i82 - (~com.identy.IdentyB.a(i92 ^ (-2047), (i92 & (-2047)) << 1, 1024, -1))) - 1;
            int i112 = i82 >> 15;
            int i122 = (((i112 | (-262143)) << 1) - (i112 ^ (-262143))) / 131072;
            int i132 = (-(i102 ^ ((i122 ^ 1) + ((i122 & 1) << 1)))) + 6;
            int e2 = com.identy.IdentyB.e(i132 >> 21, 4095, 2048, -1);
            int i142 = 1356 / ((i132 & (-((e2 & 1) + (1 | e2)))) * 226);
            if (str != null) {
            }
            query = this.a.query(acquire);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0158 A[Catch: all -> 0x0179, LOOP:0: B:9:0x0152->B:11:0x0158, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0179, blocks: (B:8:0x0131, B:9:0x0152, B:11:0x0158), top: B:7:0x0131 }] */
    @Override // com.identy.app.users.UserDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<IdentyUser> getAll() {
        Object[] objArr;
        long j;
        RoomSQLiteQuery acquire;
        Cursor query;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int uptimeMillis = (int) SystemClock.uptimeMillis();
                        int c = defpackage.a.c(uptimeMillis | (-144706572), 465, ((353887220 | (~((-145002060) | uptimeMillis))) * 930) + ((((~(uptimeMillis | 353887220)) | (-145002060)) * (-465)) - 905191524), 656643256);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 5035;
                        Fpnative.valueOf = objArr;
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = i3 * i3;
                        int i5 = -(38458705 * i3);
                        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                        int i7 = -(i3 * (-2055086465));
                        int i8 = (((i6 | i7) << 1) - (i7 ^ i6)) - (-477307456);
                        int e = com.identy.IdentyB.e(i8 >> 21, 4095, 2048, -1);
                        int i9 = (i8 ^ e) + ((e & i8) << 1);
                        int i10 = i8 >> 23;
                        int i11 = ((i10 & (-1023)) + (i10 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                        int i12 = -(((i11 ^ 1) + ((i11 & 1) << 1)) ^ i9);
                        int i13 = (i12 ^ 9) + ((i12 & 9) << 1);
                        int i14 = i13 >> 25;
                        int i15 = (((i14 | (-255)) << 1) - (i14 ^ (-255))) / 128;
                        acquire = RoomSQLiteQuery.acquire("SELECT * FROM IdentyUser", 0 / (((-(((i15 ^ 1) + ((i15 & 1) << 1)) - (-1))) & i13) * 543));
                        query = this.a.query(acquire);
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("uid");
                        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("username");
                        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("email");
                        int columnIndexOrThrow4 = query.getColumnIndexOrThrow("unique_id");
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            IdentyUser identyUser = new IdentyUser();
                            identyUser.uid = query.getInt(columnIndexOrThrow);
                            identyUser.username = query.getString(columnIndexOrThrow2);
                            identyUser.email = query.getString(columnIndexOrThrow3);
                            identyUser.uniqueId = query.getString(columnIndexOrThrow4);
                            arrayList.add(identyUser);
                        }
                        return arrayList;
                    }
                }
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("uid");
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("username");
                int columnIndexOrThrow32 = query.getColumnIndexOrThrow("email");
                int columnIndexOrThrow42 = query.getColumnIndexOrThrow("unique_id");
                ArrayList arrayList2 = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                }
                return arrayList2;
            } finally {
                query.close();
                acquire.release();
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) (-bArr[16]), (byte) 122, (byte) 23, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            d(b2, (byte) (b2 | 94), bArr[19], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 656643256);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5035;
            Fpnative.valueOf = objArr;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(38458705 * i32);
            int i62 = ((i42 | i52) << 1) - (i42 ^ i52);
            int i72 = -(i32 * (-2055086465));
            int i82 = (((i62 | i72) << 1) - (i72 ^ i62)) - (-477307456);
            int e2 = com.identy.IdentyB.e(i82 >> 21, 4095, 2048, -1);
            int i92 = (i82 ^ e2) + ((e2 & i82) << 1);
            int i102 = i82 >> 23;
            int i112 = ((i102 & (-1023)) + (i102 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i122 = -(((i112 ^ 1) + ((i112 & 1) << 1)) ^ i92);
            int i132 = (i122 ^ 9) + ((i122 & 9) << 1);
            int i142 = i132 >> 25;
            int i152 = (((i142 | (-255)) << 1) - (i142 ^ (-255))) / 128;
            acquire = RoomSQLiteQuery.acquire("SELECT * FROM IdentyUser", 0 / (((-(((i152 ^ 1) + ((i152 & 1) << 1)) - (-1))) & i132) * 543));
            query = this.a.query(acquire);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.identy.app.users.UserDao
    public final void insertAll(IdentyUser... identyUserArr) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int b2 = defpackage.a.b(639777284);
                        int i = ~b2;
                        int i2 = (~((-866492802) | i)) | 570720384;
                        int c = defpackage.a.c((~(b2 | (-71831105))) | (~(i | (-295772418))), 502, ((i2 | r0) * (-502)) - 762286785, 1193818105);
                        int i3 = c ^ (c << 13);
                        int i4 = i3 ^ (i3 >>> 17);
                        ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                        ((long[]) objArr[0])[0] = j + 4964;
                        Fpnative.valueOf = objArr;
                        this.a.beginTransaction();
                        this.b.insert((Object[]) identyUserArr);
                        this.a.setTransactionSuccessful();
                        return;
                    }
                }
                this.b.insert((Object[]) identyUserArr);
                this.a.setTransactionSuccessful();
                return;
            } finally {
                this.a.endTransaction();
            }
            byte[] bArr = $$a;
            byte b3 = (byte) (-bArr[16]);
            Object[] objArr3 = new Object[1];
            d(b3, (byte) (b3 | 78), (byte) (-bArr[31]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[68], (byte) ($$b & 112), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1193818105);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4964;
            Fpnative.valueOf = objArr;
            this.a.beginTransaction();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0179 A[Catch: all -> 0x019a, LOOP:1: B:13:0x0173->B:15:0x0179, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x019a, blocks: (B:12:0x00f6, B:13:0x0173, B:15:0x0179), top: B:11:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e6 A[LOOP:0: B:7:0x00e4->B:8:0x00e6, LOOP_END] */
    @Override // com.identy.app.users.UserDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<IdentyUser> loadAllByIds(int[] iArr) {
        Object[] objArr;
        long j;
        RoomSQLiteQuery acquire;
        Cursor query;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int c = defpackage.a.c((~((~System.identityHashCode(this)) | (-284746320))) | 473656767, 262, (((~((-284746320) | r0)) | 473656767) * 262) - 1894612533, -387833701);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4885;
                        Fpnative.valueOf = objArr;
                        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
                        newStringBuilder.append("SELECT * FROM IdentyUser WHERE uid IN (");
                        int length = iArr.length;
                        StringUtil.appendPlaceholders(newStringBuilder, length);
                        newStringBuilder.append(")");
                        acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), length);
                        int i3 = 1;
                        for (int i4 : iArr) {
                            acquire.bindLong(i3, i4);
                            i3++;
                        }
                        query = this.a.query(acquire);
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("uid");
                        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("username");
                        int i5 = ((int[]) objArr[1])[0];
                        int i6 = ((((i5 * i5) - (~(-(264764574 * i5)))) - 1) - (~(-(i5 * (-1994562862))))) - (-947721279);
                        int i7 = i6 >> 25;
                        int i8 = (((i7 ^ (-255)) + ((i7 & (-255)) << 1)) / 128) + 1;
                        int i9 = (i6 ^ i8) + ((i8 & i6) << 1);
                        int i10 = i6 >> 20;
                        int i11 = ((i10 & (-8191)) + (i10 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                        int i12 = -(i9 ^ (((i11 | 1) << 1) - (i11 ^ 1)));
                        int i13 = (i12 ^ 5) + ((i12 & 5) << 1);
                        int i14 = ((i13 >> 28) - 31) / 16;
                        int i15 = ((i14 | 1) << 1) - (i14 ^ 1);
                        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("13\\0\\17\\email".substring(32320 / (((-((i15 ^ 1) + ((i15 & 1) << 1))) & i13) * 808)));
                        int columnIndexOrThrow4 = query.getColumnIndexOrThrow("unique_id");
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            IdentyUser identyUser = new IdentyUser();
                            identyUser.uid = query.getInt(columnIndexOrThrow);
                            identyUser.username = query.getString(columnIndexOrThrow2);
                            identyUser.email = query.getString(columnIndexOrThrow3);
                            identyUser.uniqueId = query.getString(columnIndexOrThrow4);
                            arrayList.add(identyUser);
                        }
                        return arrayList;
                    }
                }
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("uid");
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("username");
                int i52 = ((int[]) objArr[1])[0];
                int i62 = ((((i52 * i52) - (~(-(264764574 * i52)))) - 1) - (~(-(i52 * (-1994562862))))) - (-947721279);
                int i72 = i62 >> 25;
                int i82 = (((i72 ^ (-255)) + ((i72 & (-255)) << 1)) / 128) + 1;
                int i92 = (i62 ^ i82) + ((i82 & i62) << 1);
                int i102 = i62 >> 20;
                int i112 = ((i102 & (-8191)) + (i102 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                int i122 = -(i92 ^ (((i112 | 1) << 1) - (i112 ^ 1)));
                int i132 = (i122 ^ 5) + ((i122 & 5) << 1);
                int i142 = ((i132 >> 28) - 31) / 16;
                int i152 = ((i142 | 1) << 1) - (i142 ^ 1);
                int columnIndexOrThrow32 = query.getColumnIndexOrThrow("13\\0\\17\\email".substring(32320 / (((-((i152 ^ 1) + ((i152 & 1) << 1))) & i132) * 808)));
                int columnIndexOrThrow42 = query.getColumnIndexOrThrow("unique_id");
                ArrayList arrayList2 = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                }
                return arrayList2;
            } finally {
                query.close();
                acquire.release();
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[16]);
            Object[] objArr3 = new Object[1];
            d(b2, (byte) (b2 | 78), (byte) (-bArr[31]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[68], (byte) ($$b & 112), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -387833701);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4885;
            Fpnative.valueOf = objArr;
            StringBuilder newStringBuilder2 = StringUtil.newStringBuilder();
            newStringBuilder2.append("SELECT * FROM IdentyUser WHERE uid IN (");
            int length2 = iArr.length;
            StringUtil.appendPlaceholders(newStringBuilder2, length2);
            newStringBuilder2.append(")");
            acquire = RoomSQLiteQuery.acquire(newStringBuilder2.toString(), length2);
            int i32 = 1;
            while (r7 < r3) {
            }
            query = this.a.query(acquire);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
