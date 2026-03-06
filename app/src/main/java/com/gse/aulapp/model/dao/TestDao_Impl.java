package com.gse.aulapp.model.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.gse.aulapp.model.data.entity.TestEntity;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class TestDao_Impl implements TestDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<TestEntity> __insertionAdapterOfTestEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllTestBySessionID;

    public TestDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTestEntity = new EntityInsertionAdapter<TestEntity>(roomDatabase) { // from class: com.gse.aulapp.model.dao.TestDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `test` (`testID`,`sessionID`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TestEntity testEntity) {
                if (testEntity.getTestID() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, testEntity.getTestID());
                }
                if (testEntity.getSessionID() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, testEntity.getSessionID());
                }
            }
        };
        this.__preparedStmtOfDeleteAllTestBySessionID = new SharedSQLiteStatement(roomDatabase) { // from class: com.gse.aulapp.model.dao.TestDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM questionApproved WHERE sessionID = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gse.aulapp.model.dao.TestDao
    public Object getTestBySessionID(String str, Continuation<? super TestEntity> continuation) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM test WHERE sessionID = ?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<TestEntity>() { // from class: com.gse.aulapp.model.dao.TestDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public TestEntity call() {
                TestEntity testEntity = null;
                String string = null;
                Cursor query = DBUtil.query(TestDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "testID");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionID");
                    if (query.moveToFirst()) {
                        String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                        if (!query.isNull(columnIndexOrThrow2)) {
                            string = query.getString(columnIndexOrThrow2);
                        }
                        testEntity = new TestEntity(string2, string);
                    }
                    return testEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.TestDao
    public Object insert(final TestEntity testEntity, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.gse.aulapp.model.dao.TestDao_Impl.3
            @Override // java.util.concurrent.Callable
            public Unit call() {
                TestDao_Impl.this.__db.beginTransaction();
                try {
                    TestDao_Impl.this.__insertionAdapterOfTestEntity.insert(testEntity);
                    TestDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TestDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }
}
