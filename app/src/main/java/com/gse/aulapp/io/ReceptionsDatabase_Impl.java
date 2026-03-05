package com.gse.aulapp.io;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import co.ceduladigital.sdk.y7;
import com.gse.aulapp.model.dao.ConfigurationSessionDao;
import com.gse.aulapp.model.dao.ConfigurationSessionDao_Impl;
import com.gse.aulapp.model.dao.CountMethodDao;
import com.gse.aulapp.model.dao.CountMethodDao_Impl;
import com.gse.aulapp.model.dao.GpsDao;
import com.gse.aulapp.model.dao.GpsDao_Impl;
import com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao;
import com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao_Impl;
import com.gse.aulapp.model.dao.QuestionDao;
import com.gse.aulapp.model.dao.QuestionDao_Impl;
import com.gse.aulapp.model.dao.ReceptionDao;
import com.gse.aulapp.model.dao.ReceptionDao_Impl;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.dao.SessionDao_Impl;
import com.gse.aulapp.model.dao.StepProcessSessionDao;
import com.gse.aulapp.model.dao.StepProcessSessionDao_Impl;
import com.gse.aulapp.model.dao.TestDao;
import com.gse.aulapp.model.dao.TestDao_Impl;
import com.gse.aulapp.model.dao.UserDao;
import com.gse.aulapp.model.dao.UserDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ReceptionsDatabase_Impl extends ReceptionsDatabase {
    private volatile ConfigurationSessionDao _configurationSessionDao;
    private volatile GpsDao _gpsDao;
    private volatile HistoricRecordPermissionsChangeDao _historicRecordPermissionsChangeDao;
    private volatile QuestionDao _questionDao;
    private volatile SessionDao _sessionDao;
    private volatile StepProcessSessionDao _stepProcessSessionDao;
    private volatile TestDao _testDao;

    @Override // com.gse.aulapp.io.ReceptionsDatabase
    public ConfigurationSessionDao ConfigurationSessionDao() {
        ConfigurationSessionDao configurationSessionDao;
        if (this._configurationSessionDao != null) {
            return this._configurationSessionDao;
        }
        synchronized (this) {
            try {
                if (this._configurationSessionDao == null) {
                    this._configurationSessionDao = new ConfigurationSessionDao_Impl(this);
                }
                configurationSessionDao = this._configurationSessionDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return configurationSessionDao;
    }

    @Override // com.gse.aulapp.io.ReceptionsDatabase
    public GpsDao GpsDao() {
        GpsDao gpsDao;
        if (this._gpsDao != null) {
            return this._gpsDao;
        }
        synchronized (this) {
            try {
                if (this._gpsDao == null) {
                    this._gpsDao = new GpsDao_Impl(this);
                }
                gpsDao = this._gpsDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gpsDao;
    }

    @Override // com.gse.aulapp.io.ReceptionsDatabase
    public HistoricRecordPermissionsChangeDao HistoricRecordPermissionsChangeDao() {
        HistoricRecordPermissionsChangeDao historicRecordPermissionsChangeDao;
        if (this._historicRecordPermissionsChangeDao != null) {
            return this._historicRecordPermissionsChangeDao;
        }
        synchronized (this) {
            try {
                if (this._historicRecordPermissionsChangeDao == null) {
                    this._historicRecordPermissionsChangeDao = new HistoricRecordPermissionsChangeDao_Impl(this);
                }
                historicRecordPermissionsChangeDao = this._historicRecordPermissionsChangeDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return historicRecordPermissionsChangeDao;
    }

    @Override // com.gse.aulapp.io.ReceptionsDatabase
    public QuestionDao QuestionDao() {
        QuestionDao questionDao;
        if (this._questionDao != null) {
            return this._questionDao;
        }
        synchronized (this) {
            try {
                if (this._questionDao == null) {
                    this._questionDao = new QuestionDao_Impl(this);
                }
                questionDao = this._questionDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return questionDao;
    }

    @Override // com.gse.aulapp.io.ReceptionsDatabase
    public SessionDao SessionDao() {
        SessionDao sessionDao;
        if (this._sessionDao != null) {
            return this._sessionDao;
        }
        synchronized (this) {
            try {
                if (this._sessionDao == null) {
                    this._sessionDao = new SessionDao_Impl(this);
                }
                sessionDao = this._sessionDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionDao;
    }

    @Override // com.gse.aulapp.io.ReceptionsDatabase
    public StepProcessSessionDao StepProcessSessionDao() {
        StepProcessSessionDao stepProcessSessionDao;
        if (this._stepProcessSessionDao != null) {
            return this._stepProcessSessionDao;
        }
        synchronized (this) {
            try {
                if (this._stepProcessSessionDao == null) {
                    this._stepProcessSessionDao = new StepProcessSessionDao_Impl(this);
                }
                stepProcessSessionDao = this._stepProcessSessionDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stepProcessSessionDao;
    }

    @Override // com.gse.aulapp.io.ReceptionsDatabase
    public TestDao TestDao() {
        TestDao testDao;
        if (this._testDao != null) {
            return this._testDao;
        }
        synchronized (this) {
            try {
                if (this._testDao == null) {
                    this._testDao = new TestDao_Impl(this);
                }
                testDao = this._testDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return testDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `reception`");
            writableDatabase.execSQL("DELETE FROM `user`");
            writableDatabase.execSQL("DELETE FROM `biometrics`");
            writableDatabase.execSQL("DELETE FROM `exams`");
            writableDatabase.execSQL("DELETE FROM `identity`");
            writableDatabase.execSQL("DELETE FROM `vehicle`");
            writableDatabase.execSQL("DELETE FROM `lesson`");
            writableDatabase.execSQL("DELETE FROM `classroom`");
            writableDatabase.execSQL("DELETE FROM `session`");
            writableDatabase.execSQL("DELETE FROM `countMethodEntry`");
            writableDatabase.execSQL("DELETE FROM `userApp`");
            writableDatabase.execSQL("DELETE FROM `hand`");
            writableDatabase.execSQL("DELETE FROM `stepProcessSession`");
            writableDatabase.execSQL("DELETE FROM `historicRecordPermissionsChange`");
            writableDatabase.execSQL("DELETE FROM `gpsTrace`");
            writableDatabase.execSQL("DELETE FROM `questionApproved`");
            writableDatabase.execSQL("DELETE FROM `test`");
            writableDatabase.execSQL("DELETE FROM `question`");
            writableDatabase.execSQL("DELETE FROM `configurationSession`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "reception", "user", "biometrics", "exams", "identity", "vehicle", "lesson", "classroom", "session", "countMethodEntry", "userApp", "hand", "stepProcessSession", "historicRecordPermissionsChange", "gpsTrace", "questionApproved", "test", "question", "configurationSession");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(19) { // from class: com.gse.aulapp.io.ReceptionsDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `reception` (`id` TEXT NOT NULL, `name` TEXT, PRIMARY KEY(`id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `user` (`id` TEXT NOT NULL, `fullName` TEXT NOT NULL, `role` TEXT NOT NULL, `email` TEXT NOT NULL, `docType` TEXT NOT NULL, `docNumber` TEXT NOT NULL, `preferredHand` TEXT NOT NULL, `biometricValidationRNEC` INTEGER NOT NULL, `usingIdenty` INTEGER NOT NULL, `withIdentityValidation` INTEGER NOT NULL, `attendance` INTEGER NOT NULL, `updateDate` TEXT, `userOwner` TEXT NOT NULL, PRIMARY KEY(`id`, `userOwner`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `biometrics` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idUser` TEXT NOT NULL, `left` INTEGER NOT NULL, `right` INTEGER NOT NULL, `exception` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `exams` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idUser` TEXT NOT NULL, `completed` INTEGER NOT NULL, `started` INTEGER NOT NULL, `toStart` INTEGER NOT NULL, `toClose` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `identity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idUser` TEXT NOT NULL, `completed` INTEGER NOT NULL, `toValidate` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `vehicle` (`vehicleID` TEXT NOT NULL, `plates` TEXT NOT NULL, `line` TEXT NOT NULL, `brand` TEXT NOT NULL, `tagCode` TEXT NOT NULL, PRIMARY KEY(`vehicleID`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `lesson` (`lessonID` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`lessonID`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `classroom` (`classroomID` TEXT NOT NULL, `nomenclature` TEXT NOT NULL, `location` TEXT NOT NULL, `type` TEXT NOT NULL, `address` TEXT NOT NULL, PRIMARY KEY(`classroomID`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `session` (`id` TEXT NOT NULL, `date` TEXT, `start` TEXT, `end` TEXT, `duration` INTEGER, `center` TEXT, `category` TEXT, `instructorID` TEXT, `classroomID` TEXT, `vehicleID` TEXT, `cellphoneNumber` TEXT, `apprentice` TEXT, `type` TEXT, `course` TEXT, `lessonID` TEXT, `dateHead` TEXT, `dateStartEntryClass` INTEGER, `dateEndEntryClass` INTEGER, `dateEndClass` INTEGER, `dateClass` INTEGER, `apprenticeEmail` TEXT, `apprenticeID` TEXT, `apprenticeDocumentNumber` TEXT, `apprenticeDocumentType` TEXT, `isFinished` INTEGER NOT NULL, `isPendingSync` INTEGER NOT NULL, `startExam` INTEGER NOT NULL, `dateStartEntry` TEXT, `enabledToStart` INTEGER, `message` TEXT, `statusAppointment` TEXT, `min_tolerance_entry_before` INTEGER NOT NULL, `min_tolerance_entry_after` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `countMethodEntry` (`userID` TEXT NOT NULL, `date` TEXT NOT NULL, `fraudCount` INTEGER NOT NULL, `fingerPrintsCount` INTEGER NOT NULL, PRIMARY KEY(`userID`, `date`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `userApp` (`userID` TEXT NOT NULL, `role` TEXT NOT NULL, `leftHand` INTEGER, `rightHand` INTEGER, PRIMARY KEY(`userID`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `hand` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `indexFinger` TEXT NOT NULL, `middleFinger` TEXT NOT NULL, `ringFinger` TEXT NOT NULL, `littleFinger` TEXT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `stepProcessSession` (`sessionID` TEXT NOT NULL, `type` TEXT NOT NULL, `status` TEXT NOT NULL, `isEntry` INTEGER NOT NULL, PRIMARY KEY(`sessionID`, `type`, `isEntry`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `historicRecordPermissionsChange` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `sessionID` TEXT NOT NULL, `date` TEXT NOT NULL, `active` INTEGER NOT NULL, `permission` TEXT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `gpsTrace` (`sessionID` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `date` INTEGER NOT NULL, `speed` REAL NOT NULL, PRIMARY KEY(`sessionID`, `date`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `questionApproved` (`sessionID` TEXT NOT NULL, `questionID` TEXT NOT NULL, `approved` INTEGER NOT NULL, PRIMARY KEY(`sessionID`, `questionID`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `test` (`testID` TEXT NOT NULL, `sessionID` TEXT NOT NULL, PRIMARY KEY(`testID`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `question` (`questionID` TEXT NOT NULL, `testID` TEXT NOT NULL, `itemID` TEXT NOT NULL, `answer` TEXT NOT NULL, `description` TEXT NOT NULL, `level` TEXT, `approved` INTEGER, `replied` INTEGER, PRIMARY KEY(`questionID`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `configurationSession` (`typeConfiguration` TEXT NOT NULL, `min_tolerance_entry_before` INTEGER NOT NULL, `min_tolerance_entry_after` INTEGER NOT NULL, `min_tolerance_departure_after` INTEGER NOT NULL, `duration_for_hour` INTEGER NOT NULL, `duration_for_hour_show` INTEGER NOT NULL, `alert_end_session` INTEGER NOT NULL, `alert_departure_after` INTEGER NOT NULL, `minutes_for_hour` INTEGER NOT NULL, PRIMARY KEY(`typeConfiguration`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '850ea398abc29ec13eea5005b5ad8a3c')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `reception`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `user`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `biometrics`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `exams`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `identity`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `vehicle`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `lesson`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `classroom`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `session`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `countMethodEntry`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `userApp`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `hand`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `stepProcessSession`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `historicRecordPermissionsChange`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `gpsTrace`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `questionApproved`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `test`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `question`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `configurationSession`");
                List list = ((RoomDatabase) ReceptionsDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                List list = ((RoomDatabase) ReceptionsDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                ((RoomDatabase) ReceptionsDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
                ReceptionsDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                List list = ((RoomDatabase) ReceptionsDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                TableInfo tableInfo = new TableInfo("reception", hashMap, y7.x(hashMap, "name", new TableInfo.Column("name", "TEXT", false, 0, null, 1), 0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "reception");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("reception(com.gse.aulapp.model.data.data.entity.Reception).\n Expected:\n", tableInfo, "\n Found:\n", read));
                }
                HashMap hashMap2 = new HashMap(13);
                hashMap2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                hashMap2.put("fullName", new TableInfo.Column("fullName", "TEXT", true, 0, null, 1));
                hashMap2.put("role", new TableInfo.Column("role", "TEXT", true, 0, null, 1));
                hashMap2.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, 1));
                hashMap2.put("docType", new TableInfo.Column("docType", "TEXT", true, 0, null, 1));
                hashMap2.put("docNumber", new TableInfo.Column("docNumber", "TEXT", true, 0, null, 1));
                hashMap2.put("preferredHand", new TableInfo.Column("preferredHand", "TEXT", true, 0, null, 1));
                hashMap2.put("biometricValidationRNEC", new TableInfo.Column("biometricValidationRNEC", "INTEGER", true, 0, null, 1));
                hashMap2.put("usingIdenty", new TableInfo.Column("usingIdenty", "INTEGER", true, 0, null, 1));
                hashMap2.put("withIdentityValidation", new TableInfo.Column("withIdentityValidation", "INTEGER", true, 0, null, 1));
                hashMap2.put("attendance", new TableInfo.Column("attendance", "INTEGER", true, 0, null, 1));
                hashMap2.put("updateDate", new TableInfo.Column("updateDate", "TEXT", false, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("user", hashMap2, y7.x(hashMap2, "userOwner", new TableInfo.Column("userOwner", "TEXT", true, 2, null, 1), 0), new HashSet(0));
                TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "user");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("user(com.gse.aulapp.model.data.entity.User).\n Expected:\n", tableInfo2, "\n Found:\n", read2));
                }
                HashMap hashMap3 = new HashMap(5);
                hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("idUser", new TableInfo.Column("idUser", "TEXT", true, 0, null, 1));
                hashMap3.put("left", new TableInfo.Column("left", "INTEGER", true, 0, null, 1));
                hashMap3.put("right", new TableInfo.Column("right", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("biometrics", hashMap3, y7.x(hashMap3, "exception", new TableInfo.Column("exception", "TEXT", false, 0, null, 1), 0), new HashSet(0));
                TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "biometrics");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("biometrics(com.gse.aulapp.model.data.entity.Biometrics).\n Expected:\n", tableInfo3, "\n Found:\n", read3));
                }
                HashMap hashMap4 = new HashMap(6);
                hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap4.put("idUser", new TableInfo.Column("idUser", "TEXT", true, 0, null, 1));
                hashMap4.put("completed", new TableInfo.Column("completed", "INTEGER", true, 0, null, 1));
                hashMap4.put("started", new TableInfo.Column("started", "INTEGER", true, 0, null, 1));
                hashMap4.put("toStart", new TableInfo.Column("toStart", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo4 = new TableInfo("exams", hashMap4, y7.x(hashMap4, "toClose", new TableInfo.Column("toClose", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read4 = TableInfo.read(supportSQLiteDatabase, "exams");
                if (!tableInfo4.equals(read4)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("exams(com.gse.aulapp.model.data.entity.Exams).\n Expected:\n", tableInfo4, "\n Found:\n", read4));
                }
                HashMap hashMap5 = new HashMap(4);
                hashMap5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap5.put("idUser", new TableInfo.Column("idUser", "TEXT", true, 0, null, 1));
                hashMap5.put("completed", new TableInfo.Column("completed", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("identity", hashMap5, y7.x(hashMap5, "toValidate", new TableInfo.Column("toValidate", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read5 = TableInfo.read(supportSQLiteDatabase, "identity");
                if (!tableInfo5.equals(read5)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("identity(com.gse.aulapp.model.data.entity.Identity).\n Expected:\n", tableInfo5, "\n Found:\n", read5));
                }
                HashMap hashMap6 = new HashMap(5);
                hashMap6.put("vehicleID", new TableInfo.Column("vehicleID", "TEXT", true, 1, null, 1));
                hashMap6.put("plates", new TableInfo.Column("plates", "TEXT", true, 0, null, 1));
                hashMap6.put("line", new TableInfo.Column("line", "TEXT", true, 0, null, 1));
                hashMap6.put("brand", new TableInfo.Column("brand", "TEXT", true, 0, null, 1));
                TableInfo tableInfo6 = new TableInfo("vehicle", hashMap6, y7.x(hashMap6, "tagCode", new TableInfo.Column("tagCode", "TEXT", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read6 = TableInfo.read(supportSQLiteDatabase, "vehicle");
                if (!tableInfo6.equals(read6)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("vehicle(com.gse.aulapp.model.data.entity.VehicleEntity).\n Expected:\n", tableInfo6, "\n Found:\n", read6));
                }
                HashMap hashMap7 = new HashMap(2);
                hashMap7.put("lessonID", new TableInfo.Column("lessonID", "TEXT", true, 1, null, 1));
                TableInfo tableInfo7 = new TableInfo("lesson", hashMap7, y7.x(hashMap7, "name", new TableInfo.Column("name", "TEXT", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read7 = TableInfo.read(supportSQLiteDatabase, "lesson");
                if (!tableInfo7.equals(read7)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("lesson(com.gse.aulapp.model.data.entity.LessonEntity).\n Expected:\n", tableInfo7, "\n Found:\n", read7));
                }
                HashMap hashMap8 = new HashMap(5);
                hashMap8.put("classroomID", new TableInfo.Column("classroomID", "TEXT", true, 1, null, 1));
                hashMap8.put("nomenclature", new TableInfo.Column("nomenclature", "TEXT", true, 0, null, 1));
                hashMap8.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, 1));
                hashMap8.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                TableInfo tableInfo8 = new TableInfo("classroom", hashMap8, y7.x(hashMap8, "address", new TableInfo.Column("address", "TEXT", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read8 = TableInfo.read(supportSQLiteDatabase, "classroom");
                if (!tableInfo8.equals(read8)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("classroom(com.gse.aulapp.model.data.entity.ClassRoomEntity).\n Expected:\n", tableInfo8, "\n Found:\n", read8));
                }
                HashMap hashMap9 = new HashMap(33);
                hashMap9.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                hashMap9.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, 1));
                hashMap9.put("start", new TableInfo.Column("start", "TEXT", false, 0, null, 1));
                hashMap9.put("end", new TableInfo.Column("end", "TEXT", false, 0, null, 1));
                hashMap9.put("duration", new TableInfo.Column("duration", "INTEGER", false, 0, null, 1));
                hashMap9.put("center", new TableInfo.Column("center", "TEXT", false, 0, null, 1));
                hashMap9.put("category", new TableInfo.Column("category", "TEXT", false, 0, null, 1));
                hashMap9.put("instructorID", new TableInfo.Column("instructorID", "TEXT", false, 0, null, 1));
                hashMap9.put("classroomID", new TableInfo.Column("classroomID", "TEXT", false, 0, null, 1));
                hashMap9.put("vehicleID", new TableInfo.Column("vehicleID", "TEXT", false, 0, null, 1));
                hashMap9.put("cellphoneNumber", new TableInfo.Column("cellphoneNumber", "TEXT", false, 0, null, 1));
                hashMap9.put("apprentice", new TableInfo.Column("apprentice", "TEXT", false, 0, null, 1));
                hashMap9.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, 1));
                hashMap9.put("course", new TableInfo.Column("course", "TEXT", false, 0, null, 1));
                hashMap9.put("lessonID", new TableInfo.Column("lessonID", "TEXT", false, 0, null, 1));
                hashMap9.put("dateHead", new TableInfo.Column("dateHead", "TEXT", false, 0, null, 1));
                hashMap9.put("dateStartEntryClass", new TableInfo.Column("dateStartEntryClass", "INTEGER", false, 0, null, 1));
                hashMap9.put("dateEndEntryClass", new TableInfo.Column("dateEndEntryClass", "INTEGER", false, 0, null, 1));
                hashMap9.put("dateEndClass", new TableInfo.Column("dateEndClass", "INTEGER", false, 0, null, 1));
                hashMap9.put("dateClass", new TableInfo.Column("dateClass", "INTEGER", false, 0, null, 1));
                hashMap9.put("apprenticeEmail", new TableInfo.Column("apprenticeEmail", "TEXT", false, 0, null, 1));
                hashMap9.put("apprenticeID", new TableInfo.Column("apprenticeID", "TEXT", false, 0, null, 1));
                hashMap9.put("apprenticeDocumentNumber", new TableInfo.Column("apprenticeDocumentNumber", "TEXT", false, 0, null, 1));
                hashMap9.put("apprenticeDocumentType", new TableInfo.Column("apprenticeDocumentType", "TEXT", false, 0, null, 1));
                hashMap9.put("isFinished", new TableInfo.Column("isFinished", "INTEGER", true, 0, null, 1));
                hashMap9.put("isPendingSync", new TableInfo.Column("isPendingSync", "INTEGER", true, 0, null, 1));
                hashMap9.put("startExam", new TableInfo.Column("startExam", "INTEGER", true, 0, null, 1));
                hashMap9.put("dateStartEntry", new TableInfo.Column("dateStartEntry", "TEXT", false, 0, null, 1));
                hashMap9.put("enabledToStart", new TableInfo.Column("enabledToStart", "INTEGER", false, 0, null, 1));
                hashMap9.put("message", new TableInfo.Column("message", "TEXT", false, 0, null, 1));
                hashMap9.put("statusAppointment", new TableInfo.Column("statusAppointment", "TEXT", false, 0, null, 1));
                hashMap9.put("min_tolerance_entry_before", new TableInfo.Column("min_tolerance_entry_before", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("session", hashMap9, y7.x(hashMap9, "min_tolerance_entry_after", new TableInfo.Column("min_tolerance_entry_after", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read9 = TableInfo.read(supportSQLiteDatabase, "session");
                if (!tableInfo9.equals(read9)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("session(com.gse.aulapp.model.data.entity.SessionEntity).\n Expected:\n", tableInfo9, "\n Found:\n", read9));
                }
                HashMap hashMap10 = new HashMap(4);
                hashMap10.put("userID", new TableInfo.Column("userID", "TEXT", true, 1, null, 1));
                hashMap10.put("date", new TableInfo.Column("date", "TEXT", true, 2, null, 1));
                hashMap10.put("fraudCount", new TableInfo.Column("fraudCount", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo10 = new TableInfo("countMethodEntry", hashMap10, y7.x(hashMap10, "fingerPrintsCount", new TableInfo.Column("fingerPrintsCount", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read10 = TableInfo.read(supportSQLiteDatabase, "countMethodEntry");
                if (!tableInfo10.equals(read10)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("countMethodEntry(com.gse.aulapp.model.data.entity.CountMethodEntryEntity).\n Expected:\n", tableInfo10, "\n Found:\n", read10));
                }
                HashMap hashMap11 = new HashMap(4);
                hashMap11.put("userID", new TableInfo.Column("userID", "TEXT", true, 1, null, 1));
                hashMap11.put("role", new TableInfo.Column("role", "TEXT", true, 0, null, 1));
                hashMap11.put("leftHand", new TableInfo.Column("leftHand", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("userApp", hashMap11, y7.x(hashMap11, "rightHand", new TableInfo.Column("rightHand", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
                TableInfo read11 = TableInfo.read(supportSQLiteDatabase, "userApp");
                if (!tableInfo11.equals(read11)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("userApp(com.gse.aulapp.model.data.entity.UserEntity).\n Expected:\n", tableInfo11, "\n Found:\n", read11));
                }
                HashMap hashMap12 = new HashMap(6);
                hashMap12.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap12.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                hashMap12.put("indexFinger", new TableInfo.Column("indexFinger", "TEXT", true, 0, null, 1));
                hashMap12.put("middleFinger", new TableInfo.Column("middleFinger", "TEXT", true, 0, null, 1));
                hashMap12.put("ringFinger", new TableInfo.Column("ringFinger", "TEXT", true, 0, null, 1));
                TableInfo tableInfo12 = new TableInfo("hand", hashMap12, y7.x(hashMap12, "littleFinger", new TableInfo.Column("littleFinger", "TEXT", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read12 = TableInfo.read(supportSQLiteDatabase, "hand");
                if (!tableInfo12.equals(read12)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("hand(com.gse.aulapp.model.data.entity.HandEntity).\n Expected:\n", tableInfo12, "\n Found:\n", read12));
                }
                HashMap hashMap13 = new HashMap(4);
                hashMap13.put("sessionID", new TableInfo.Column("sessionID", "TEXT", true, 1, null, 1));
                hashMap13.put("type", new TableInfo.Column("type", "TEXT", true, 2, null, 1));
                hashMap13.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
                TableInfo tableInfo13 = new TableInfo("stepProcessSession", hashMap13, y7.x(hashMap13, "isEntry", new TableInfo.Column("isEntry", "INTEGER", true, 3, null, 1), 0), new HashSet(0));
                TableInfo read13 = TableInfo.read(supportSQLiteDatabase, "stepProcessSession");
                if (!tableInfo13.equals(read13)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("stepProcessSession(com.gse.aulapp.model.data.entity.StepProcessSessionEntity).\n Expected:\n", tableInfo13, "\n Found:\n", read13));
                }
                HashMap hashMap14 = new HashMap(5);
                hashMap14.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
                hashMap14.put("sessionID", new TableInfo.Column("sessionID", "TEXT", true, 0, null, 1));
                hashMap14.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
                hashMap14.put("active", new TableInfo.Column("active", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo14 = new TableInfo("historicRecordPermissionsChange", hashMap14, y7.x(hashMap14, "permission", new TableInfo.Column("permission", "TEXT", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read14 = TableInfo.read(supportSQLiteDatabase, "historicRecordPermissionsChange");
                if (!tableInfo14.equals(read14)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("historicRecordPermissionsChange(com.gse.aulapp.model.data.entity.HistoricRecordPermissionsChangeEntity).\n Expected:\n", tableInfo14, "\n Found:\n", read14));
                }
                HashMap hashMap15 = new HashMap(5);
                hashMap15.put("sessionID", new TableInfo.Column("sessionID", "TEXT", true, 1, null, 1));
                hashMap15.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, 1));
                hashMap15.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, 1));
                hashMap15.put("date", new TableInfo.Column("date", "INTEGER", true, 2, null, 1));
                TableInfo tableInfo15 = new TableInfo("gpsTrace", hashMap15, y7.x(hashMap15, "speed", new TableInfo.Column("speed", "REAL", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read15 = TableInfo.read(supportSQLiteDatabase, "gpsTrace");
                if (!tableInfo15.equals(read15)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("gpsTrace(com.gse.aulapp.model.data.entity.GpsTraceEntity).\n Expected:\n", tableInfo15, "\n Found:\n", read15));
                }
                HashMap hashMap16 = new HashMap(3);
                hashMap16.put("sessionID", new TableInfo.Column("sessionID", "TEXT", true, 1, null, 1));
                hashMap16.put("questionID", new TableInfo.Column("questionID", "TEXT", true, 2, null, 1));
                TableInfo tableInfo16 = new TableInfo("questionApproved", hashMap16, y7.x(hashMap16, "approved", new TableInfo.Column("approved", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read16 = TableInfo.read(supportSQLiteDatabase, "questionApproved");
                if (!tableInfo16.equals(read16)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("questionApproved(com.gse.aulapp.model.data.entity.QuestionApprovedEntity).\n Expected:\n", tableInfo16, "\n Found:\n", read16));
                }
                HashMap hashMap17 = new HashMap(2);
                hashMap17.put("testID", new TableInfo.Column("testID", "TEXT", true, 1, null, 1));
                TableInfo tableInfo17 = new TableInfo("test", hashMap17, y7.x(hashMap17, "sessionID", new TableInfo.Column("sessionID", "TEXT", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read17 = TableInfo.read(supportSQLiteDatabase, "test");
                if (!tableInfo17.equals(read17)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("test(com.gse.aulapp.model.data.entity.TestEntity).\n Expected:\n", tableInfo17, "\n Found:\n", read17));
                }
                HashMap hashMap18 = new HashMap(8);
                hashMap18.put("questionID", new TableInfo.Column("questionID", "TEXT", true, 1, null, 1));
                hashMap18.put("testID", new TableInfo.Column("testID", "TEXT", true, 0, null, 1));
                hashMap18.put("itemID", new TableInfo.Column("itemID", "TEXT", true, 0, null, 1));
                hashMap18.put("answer", new TableInfo.Column("answer", "TEXT", true, 0, null, 1));
                hashMap18.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
                hashMap18.put("level", new TableInfo.Column("level", "TEXT", false, 0, null, 1));
                hashMap18.put("approved", new TableInfo.Column("approved", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo18 = new TableInfo("question", hashMap18, y7.x(hashMap18, "replied", new TableInfo.Column("replied", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
                TableInfo read18 = TableInfo.read(supportSQLiteDatabase, "question");
                if (!tableInfo18.equals(read18)) {
                    return new RoomOpenHelper.ValidationResult(false, y7.m("question(com.gse.aulapp.model.data.entity.QuestionEntity).\n Expected:\n", tableInfo18, "\n Found:\n", read18));
                }
                HashMap hashMap19 = new HashMap(9);
                hashMap19.put("typeConfiguration", new TableInfo.Column("typeConfiguration", "TEXT", true, 1, null, 1));
                hashMap19.put("min_tolerance_entry_before", new TableInfo.Column("min_tolerance_entry_before", "INTEGER", true, 0, null, 1));
                hashMap19.put("min_tolerance_entry_after", new TableInfo.Column("min_tolerance_entry_after", "INTEGER", true, 0, null, 1));
                hashMap19.put("min_tolerance_departure_after", new TableInfo.Column("min_tolerance_departure_after", "INTEGER", true, 0, null, 1));
                hashMap19.put("duration_for_hour", new TableInfo.Column("duration_for_hour", "INTEGER", true, 0, null, 1));
                hashMap19.put("duration_for_hour_show", new TableInfo.Column("duration_for_hour_show", "INTEGER", true, 0, null, 1));
                hashMap19.put("alert_end_session", new TableInfo.Column("alert_end_session", "INTEGER", true, 0, null, 1));
                hashMap19.put("alert_departure_after", new TableInfo.Column("alert_departure_after", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo19 = new TableInfo("configurationSession", hashMap19, y7.x(hashMap19, "minutes_for_hour", new TableInfo.Column("minutes_for_hour", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
                TableInfo read19 = TableInfo.read(supportSQLiteDatabase, "configurationSession");
                return !tableInfo19.equals(read19) ? new RoomOpenHelper.ValidationResult(false, y7.m("configurationSession(com.gse.aulapp.model.data.entity.ConfigurationSessionEntity).\n Expected:\n", tableInfo19, "\n Found:\n", read19)) : new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "850ea398abc29ec13eea5005b5ad8a3c", "087a05a2737ddc40d3517bd58f75dc52")).build());
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ReceptionDao.class, ReceptionDao_Impl.getRequiredConverters());
        hashMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
        hashMap.put(SessionDao.class, SessionDao_Impl.getRequiredConverters());
        hashMap.put(CountMethodDao.class, CountMethodDao_Impl.getRequiredConverters());
        hashMap.put(StepProcessSessionDao.class, StepProcessSessionDao_Impl.getRequiredConverters());
        hashMap.put(HistoricRecordPermissionsChangeDao.class, HistoricRecordPermissionsChangeDao_Impl.getRequiredConverters());
        hashMap.put(GpsDao.class, GpsDao_Impl.getRequiredConverters());
        hashMap.put(TestDao.class, TestDao_Impl.getRequiredConverters());
        hashMap.put(QuestionDao.class, QuestionDao_Impl.getRequiredConverters());
        hashMap.put(ConfigurationSessionDao.class, ConfigurationSessionDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
