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
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class StepProcessSessionDao_Impl implements StepProcessSessionDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<StepProcessSessionEntity> __insertionAdapterOfStepProcessSessionEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteSessionsOfSessionId;

    public StepProcessSessionDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfStepProcessSessionEntity = new EntityInsertionAdapter<StepProcessSessionEntity>(roomDatabase) { // from class: com.gse.aulapp.model.dao.StepProcessSessionDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `stepProcessSession` (`sessionID`,`type`,`status`,`isEntry`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, StepProcessSessionEntity stepProcessSessionEntity) {
                if (stepProcessSessionEntity.getSessionID() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, stepProcessSessionEntity.getSessionID());
                }
                if (stepProcessSessionEntity.getType() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, stepProcessSessionEntity.getType());
                }
                if (stepProcessSessionEntity.getStatus() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, stepProcessSessionEntity.getStatus());
                }
                supportSQLiteStatement.bindLong(4, stepProcessSessionEntity.isEntry() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfDeleteSessionsOfSessionId = new SharedSQLiteStatement(roomDatabase) { // from class: com.gse.aulapp.model.dao.StepProcessSessionDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM stepProcessSession WHERE sessionID = ?";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StepProcessSessionEntity __entityCursorConverter_comGseAulappModelDataEntityStepProcessSessionEntity(Cursor cursor) {
        int columnIndex = CursorUtil.getColumnIndex(cursor, "sessionID");
        int columnIndex2 = CursorUtil.getColumnIndex(cursor, "type");
        int columnIndex3 = CursorUtil.getColumnIndex(cursor, "status");
        int columnIndex4 = CursorUtil.getColumnIndex(cursor, "isEntry");
        String str = null;
        String string = (columnIndex == -1 || cursor.isNull(columnIndex)) ? null : cursor.getString(columnIndex);
        String string2 = (columnIndex2 == -1 || cursor.isNull(columnIndex2)) ? null : cursor.getString(columnIndex2);
        if (columnIndex3 != -1 && !cursor.isNull(columnIndex3)) {
            str = cursor.getString(columnIndex3);
        }
        boolean z = false;
        if (columnIndex4 != -1 && cursor.getInt(columnIndex4) != 0) {
            z = true;
        }
        return new StepProcessSessionEntity(string, string2, str, z);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gse.aulapp.model.dao.StepProcessSessionDao
    public Object deleteSessionsOfSessionId(final String str, Continuation continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.gse.aulapp.model.dao.StepProcessSessionDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() {
                SupportSQLiteStatement acquire = StepProcessSessionDao_Impl.this.__preparedStmtOfDeleteSessionsOfSessionId.acquire();
                String str2 = str;
                if (str2 == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str2);
                }
                try {
                    StepProcessSessionDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        StepProcessSessionDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        StepProcessSessionDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    StepProcessSessionDao_Impl.this.__preparedStmtOfDeleteSessionsOfSessionId.release(acquire);
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.StepProcessSessionDao
    public Object getStepCustom(final SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<StepProcessSessionEntity>> continuation) {
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<StepProcessSessionEntity>>() { // from class: com.gse.aulapp.model.dao.StepProcessSessionDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<StepProcessSessionEntity> call() {
                Cursor query = DBUtil.query(StepProcessSessionDao_Impl.this.__db, simpleSQLiteQuery, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(StepProcessSessionDao_Impl.this.__entityCursorConverter_comGseAulappModelDataEntityStepProcessSessionEntity(query));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.StepProcessSessionDao
    public Object saveUpdateStep(final StepProcessSessionEntity stepProcessSessionEntity, Continuation continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.gse.aulapp.model.dao.StepProcessSessionDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                StepProcessSessionDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(StepProcessSessionDao_Impl.this.__insertionAdapterOfStepProcessSessionEntity.insertAndReturnId(stepProcessSessionEntity));
                    StepProcessSessionDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    StepProcessSessionDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }
}
