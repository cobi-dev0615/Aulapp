package com.gse.aulapp.model.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.gse.aulapp.model.data.entity.GpsTraceEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class GpsDao_Impl implements GpsDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<GpsTraceEntity> __insertionAdapterOfGpsTraceEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteGpsTraceBySessionID;

    public GpsDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfGpsTraceEntity = new EntityInsertionAdapter<GpsTraceEntity>(roomDatabase) { // from class: com.gse.aulapp.model.dao.GpsDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `gpsTrace` (`sessionID`,`latitude`,`longitude`,`date`,`speed`) VALUES (?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, GpsTraceEntity gpsTraceEntity) {
                if (gpsTraceEntity.getSessionID() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, gpsTraceEntity.getSessionID());
                }
                supportSQLiteStatement.bindDouble(2, gpsTraceEntity.getLatitude());
                supportSQLiteStatement.bindDouble(3, gpsTraceEntity.getLongitude());
                supportSQLiteStatement.bindLong(4, gpsTraceEntity.getDate());
                supportSQLiteStatement.bindDouble(5, gpsTraceEntity.getSpeed());
            }
        };
        this.__preparedStmtOfDeleteGpsTraceBySessionID = new SharedSQLiteStatement(roomDatabase) { // from class: com.gse.aulapp.model.dao.GpsDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gpsTrace where sessionID = ?";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GpsTraceEntity __entityCursorConverter_comGseAulappModelDataEntityGpsTraceEntity(Cursor cursor) {
        int columnIndex = CursorUtil.getColumnIndex(cursor, "sessionID");
        int columnIndex2 = CursorUtil.getColumnIndex(cursor, "latitude");
        int columnIndex3 = CursorUtil.getColumnIndex(cursor, "longitude");
        int columnIndex4 = CursorUtil.getColumnIndex(cursor, "date");
        int columnIndex5 = CursorUtil.getColumnIndex(cursor, "speed");
        String str = null;
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            str = cursor.getString(columnIndex);
        }
        return new GpsTraceEntity(str, columnIndex2 == -1 ? 0.0d : cursor.getDouble(columnIndex2), columnIndex3 == -1 ? 0.0d : cursor.getDouble(columnIndex3), columnIndex4 == -1 ? 0L : cursor.getLong(columnIndex4), columnIndex5 != -1 ? cursor.getDouble(columnIndex5) : 0.0d);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gse.aulapp.model.dao.GpsDao
    public Object deleteGpsTraceBySessionID(final String str, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.gse.aulapp.model.dao.GpsDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() {
                SupportSQLiteStatement acquire = GpsDao_Impl.this.__preparedStmtOfDeleteGpsTraceBySessionID.acquire();
                String str2 = str;
                if (str2 == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str2);
                }
                try {
                    GpsDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GpsDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GpsDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GpsDao_Impl.this.__preparedStmtOfDeleteGpsTraceBySessionID.release(acquire);
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.GpsDao
    public Object getAllGpsTraceCustom(final SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<GpsTraceEntity>> continuation) {
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GpsTraceEntity>>() { // from class: com.gse.aulapp.model.dao.GpsDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<GpsTraceEntity> call() {
                Cursor query = DBUtil.query(GpsDao_Impl.this.__db, simpleSQLiteQuery, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(GpsDao_Impl.this.__entityCursorConverter_comGseAulappModelDataEntityGpsTraceEntity(query));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.GpsDao
    public Object getSpeedCustom(final SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Double> continuation) {
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Double>() { // from class: com.gse.aulapp.model.dao.GpsDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Double call() {
                Double d = null;
                Cursor query = DBUtil.query(GpsDao_Impl.this.__db, simpleSQLiteQuery, false, null);
                try {
                    if (query.moveToFirst() && !query.isNull(0)) {
                        d = Double.valueOf(query.getDouble(0));
                    }
                    return d;
                } finally {
                    query.close();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.GpsDao
    public Object saveGpsTrace(final GpsTraceEntity gpsTraceEntity, Continuation<? super Long> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.gse.aulapp.model.dao.GpsDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                GpsDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GpsDao_Impl.this.__insertionAdapterOfGpsTraceEntity.insertAndReturnId(gpsTraceEntity));
                    GpsDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GpsDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }
}
