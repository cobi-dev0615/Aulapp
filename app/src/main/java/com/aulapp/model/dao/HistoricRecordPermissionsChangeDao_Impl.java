package com.gse.aulapp.model.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.gse.aulapp.model.data.entity.HistoricRecordPermissionsChangeEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class HistoricRecordPermissionsChangeDao_Impl implements HistoricRecordPermissionsChangeDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<HistoricRecordPermissionsChangeEntity> __insertionAdapterOfHistoricRecordPermissionsChangeEntity;

    public HistoricRecordPermissionsChangeDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfHistoricRecordPermissionsChangeEntity = new EntityInsertionAdapter<HistoricRecordPermissionsChangeEntity>(roomDatabase) { // from class: com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `historicRecordPermissionsChange` (`id`,`sessionID`,`date`,`active`,`permission`) VALUES (?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, HistoricRecordPermissionsChangeEntity historicRecordPermissionsChangeEntity) {
                if (historicRecordPermissionsChangeEntity.getId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindLong(1, historicRecordPermissionsChangeEntity.getId().intValue());
                }
                if (historicRecordPermissionsChangeEntity.getSessionID() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, historicRecordPermissionsChangeEntity.getSessionID());
                }
                if (historicRecordPermissionsChangeEntity.getDate() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, historicRecordPermissionsChangeEntity.getDate());
                }
                supportSQLiteStatement.bindLong(4, historicRecordPermissionsChangeEntity.getActive() ? 1L : 0L);
                if (historicRecordPermissionsChangeEntity.getPermission() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, historicRecordPermissionsChangeEntity.getPermission());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HistoricRecordPermissionsChangeEntity __entityCursorConverter_comGseAulappModelDataEntityHistoricRecordPermissionsChangeEntity(Cursor cursor) {
        int columnIndex = CursorUtil.getColumnIndex(cursor, "id");
        int columnIndex2 = CursorUtil.getColumnIndex(cursor, "sessionID");
        int columnIndex3 = CursorUtil.getColumnIndex(cursor, "date");
        int columnIndex4 = CursorUtil.getColumnIndex(cursor, "active");
        int columnIndex5 = CursorUtil.getColumnIndex(cursor, "permission");
        String str = null;
        Integer valueOf = (columnIndex == -1 || cursor.isNull(columnIndex)) ? null : Integer.valueOf(cursor.getInt(columnIndex));
        String string = (columnIndex2 == -1 || cursor.isNull(columnIndex2)) ? null : cursor.getString(columnIndex2);
        String string2 = (columnIndex3 == -1 || cursor.isNull(columnIndex3)) ? null : cursor.getString(columnIndex3);
        boolean z = false;
        if (columnIndex4 != -1 && cursor.getInt(columnIndex4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (columnIndex5 != -1 && !cursor.isNull(columnIndex5)) {
            str = cursor.getString(columnIndex5);
        }
        return new HistoricRecordPermissionsChangeEntity(valueOf, string, string2, z2, str);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao
    public Object deleteHistoricCustom(final SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Long> continuation) {
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Long>() { // from class: com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                Long l = null;
                Cursor query = DBUtil.query(HistoricRecordPermissionsChangeDao_Impl.this.__db, simpleSQLiteQuery, false, null);
                try {
                    if (query.moveToFirst() && !query.isNull(0)) {
                        l = Long.valueOf(query.getLong(0));
                    }
                    return l;
                } finally {
                    query.close();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao
    public Object getHistoricCustom(final SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<HistoricRecordPermissionsChangeEntity>> continuation) {
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<HistoricRecordPermissionsChangeEntity>>() { // from class: com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao_Impl.3
            @Override // java.util.concurrent.Callable
            public List<HistoricRecordPermissionsChangeEntity> call() {
                Cursor query = DBUtil.query(HistoricRecordPermissionsChangeDao_Impl.this.__db, simpleSQLiteQuery, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(HistoricRecordPermissionsChangeDao_Impl.this.__entityCursorConverter_comGseAulappModelDataEntityHistoricRecordPermissionsChangeEntity(query));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao
    public Object saveHistoric(final HistoricRecordPermissionsChangeEntity historicRecordPermissionsChangeEntity, Continuation<? super Long> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao_Impl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                HistoricRecordPermissionsChangeDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(HistoricRecordPermissionsChangeDao_Impl.this.__insertionAdapterOfHistoricRecordPermissionsChangeEntity.insertAndReturnId(historicRecordPermissionsChangeEntity));
                    HistoricRecordPermissionsChangeDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    HistoricRecordPermissionsChangeDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }
}
