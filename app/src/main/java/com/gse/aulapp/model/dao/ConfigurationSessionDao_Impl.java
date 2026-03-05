package com.gse.aulapp.model.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.gse.aulapp.model.data.entity.ConfigurationSessionEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ConfigurationSessionDao_Impl implements ConfigurationSessionDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<ConfigurationSessionEntity> __insertionAdapterOfConfigurationSessionEntity;

    public ConfigurationSessionDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfConfigurationSessionEntity = new EntityInsertionAdapter<ConfigurationSessionEntity>(roomDatabase) { // from class: com.gse.aulapp.model.dao.ConfigurationSessionDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `configurationSession` (`typeConfiguration`,`min_tolerance_entry_before`,`min_tolerance_entry_after`,`min_tolerance_departure_after`,`duration_for_hour`,`duration_for_hour_show`,`alert_end_session`,`alert_departure_after`,`minutes_for_hour`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ConfigurationSessionEntity configurationSessionEntity) {
                if (configurationSessionEntity.getTypeConfiguration() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, configurationSessionEntity.getTypeConfiguration());
                }
                supportSQLiteStatement.bindLong(2, configurationSessionEntity.getMinToleranceEntryBefore());
                supportSQLiteStatement.bindLong(3, configurationSessionEntity.getMinToleranceEntryAfter());
                supportSQLiteStatement.bindLong(4, configurationSessionEntity.getMinToleranceDepartureAfter());
                supportSQLiteStatement.bindLong(5, configurationSessionEntity.getDurationForHour());
                supportSQLiteStatement.bindLong(6, configurationSessionEntity.getDurationForHourShow());
                supportSQLiteStatement.bindLong(7, configurationSessionEntity.getAlertEndSession());
                supportSQLiteStatement.bindLong(8, configurationSessionEntity.getAlertDepartureAfter());
                supportSQLiteStatement.bindLong(9, configurationSessionEntity.getMinuteForHour());
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gse.aulapp.model.dao.ConfigurationSessionDao
    public Object getConfiguration(Continuation<? super List<ConfigurationSessionEntity>> continuation) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM configurationSession ", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ConfigurationSessionEntity>>() { // from class: com.gse.aulapp.model.dao.ConfigurationSessionDao_Impl.3
            @Override // java.util.concurrent.Callable
            public List<ConfigurationSessionEntity> call() {
                Cursor query = DBUtil.query(ConfigurationSessionDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "typeConfiguration");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "min_tolerance_entry_before");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "min_tolerance_entry_after");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "min_tolerance_departure_after");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "duration_for_hour");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "duration_for_hour_show");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "alert_end_session");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "alert_departure_after");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "minutes_for_hour");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ConfigurationSessionEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7), query.getInt(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.ConfigurationSessionDao
    public Object getConfigurationByType(String str, Continuation<? super ConfigurationSessionEntity> continuation) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM configurationSession WHERE typeConfiguration =?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<ConfigurationSessionEntity>() { // from class: com.gse.aulapp.model.dao.ConfigurationSessionDao_Impl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ConfigurationSessionEntity call() {
                ConfigurationSessionEntity configurationSessionEntity = null;
                Cursor query = DBUtil.query(ConfigurationSessionDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "typeConfiguration");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "min_tolerance_entry_before");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "min_tolerance_entry_after");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "min_tolerance_departure_after");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "duration_for_hour");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "duration_for_hour_show");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "alert_end_session");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "alert_departure_after");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "minutes_for_hour");
                    if (query.moveToFirst()) {
                        configurationSessionEntity = new ConfigurationSessionEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7), query.getInt(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9));
                    }
                    return configurationSessionEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, continuation);
    }

    @Override // com.gse.aulapp.model.dao.ConfigurationSessionDao
    public long insert(ConfigurationSessionEntity configurationSessionEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfConfigurationSessionEntity.insertAndReturnId(configurationSessionEntity);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
