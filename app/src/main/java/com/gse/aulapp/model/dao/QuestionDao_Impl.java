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
import com.gse.aulapp.model.data.entity.QuestionEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class QuestionDao_Impl implements QuestionDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<QuestionEntity> __insertionAdapterOfQuestionEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllQuestionOfTestID;
    private final SharedSQLiteStatement __preparedStmtOfUpdateQuestionApproved;

    public QuestionDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfQuestionEntity = new EntityInsertionAdapter<QuestionEntity>(roomDatabase) { // from class: com.gse.aulapp.model.dao.QuestionDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `question` (`questionID`,`testID`,`itemID`,`answer`,`description`,`level`,`approved`,`replied`) VALUES (?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, QuestionEntity questionEntity) {
                if (questionEntity.getQuestionID() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, questionEntity.getQuestionID());
                }
                if (questionEntity.getTestID() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, questionEntity.getTestID());
                }
                if (questionEntity.getItemID() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, questionEntity.getItemID());
                }
                if (questionEntity.getAnswer() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, questionEntity.getAnswer());
                }
                if (questionEntity.getDescription() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, questionEntity.getDescription());
                }
                if (questionEntity.getLevel() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, questionEntity.getLevel());
                }
                Integer _tmpApproved = questionEntity.getApproved() == null ? null : Integer.valueOf(questionEntity.getApproved().booleanValue() ? 1 : 0);
                if (_tmpApproved == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, _tmpApproved.intValue());
                }
                Integer _tmpReplied = questionEntity.getReplied() != null ? Integer.valueOf(questionEntity.getReplied().booleanValue() ? 1 : 0) : null;
                if (_tmpReplied == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindLong(8, _tmpReplied.intValue());
                }
            }
        };
        this.__preparedStmtOfUpdateQuestionApproved = new SharedSQLiteStatement(roomDatabase) { // from class: com.gse.aulapp.model.dao.QuestionDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE question SET answer = ? WHERE questionID = ? AND testID = ?";
            }
        };
        this.__preparedStmtOfDeleteAllQuestionOfTestID = new SharedSQLiteStatement(roomDatabase) { // from class: com.gse.aulapp.model.dao.QuestionDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM question WHERE testID = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gse.aulapp.model.dao.QuestionDao
    public Object deleteAllQuestionOfTestID(final String str, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.gse.aulapp.model.dao.QuestionDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() {
                SupportSQLiteStatement acquire = QuestionDao_Impl.this.__preparedStmtOfDeleteAllQuestionOfTestID.acquire();
                String str2 = str;
                if (str2 == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str2);
                }
                try {
                    QuestionDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        QuestionDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        QuestionDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    QuestionDao_Impl.this.__preparedStmtOfDeleteAllQuestionOfTestID.release(acquire);
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.QuestionDao
    public Object getQuestionsByTestID(String str, Continuation<? super List<QuestionEntity>> continuation) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM question WHERE testID = ?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<QuestionEntity>>() { // from class: com.gse.aulapp.model.dao.QuestionDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<QuestionEntity> call() {
                Boolean valueOf;
                Boolean valueOf2;
                Cursor query = DBUtil.query(QuestionDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "questionID");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "testID");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemID");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "answer");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "level");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "approved");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "replied");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                        String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        String string5 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        String string6 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                        Integer valueOf3 = query.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow7));
                        boolean z = true;
                        if (valueOf3 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                        }
                        Integer valueOf4 = query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8));
                        if (valueOf4 == null) {
                            valueOf2 = null;
                        } else {
                            if (valueOf4.intValue() == 0) {
                                z = false;
                            }
                            valueOf2 = Boolean.valueOf(z);
                        }
                        arrayList.add(new QuestionEntity(string, string2, string3, string4, string5, string6, valueOf, valueOf2));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.QuestionDao
    public Object insert(final QuestionEntity questionEntity, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.gse.aulapp.model.dao.QuestionDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() {
                QuestionDao_Impl.this.__db.beginTransaction();
                try {
                    QuestionDao_Impl.this.__insertionAdapterOfQuestionEntity.insert(questionEntity);
                    QuestionDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    QuestionDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.QuestionDao
    public Object updateQuestionApproved(final String str, final String str2, final String str3, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.gse.aulapp.model.dao.QuestionDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() {
                SupportSQLiteStatement acquire = QuestionDao_Impl.this.__preparedStmtOfUpdateQuestionApproved.acquire();
                String str4 = str3;
                if (str4 == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str4);
                }
                String str5 = str;
                if (str5 == null) {
                    acquire.bindNull(2);
                } else {
                    acquire.bindString(2, str5);
                }
                String str6 = str2;
                if (str6 == null) {
                    acquire.bindNull(3);
                } else {
                    acquire.bindString(3, str6);
                }
                try {
                    QuestionDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        QuestionDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        QuestionDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    QuestionDao_Impl.this.__preparedStmtOfUpdateQuestionApproved.release(acquire);
                }
            }
        }, continuation);
    }
}
