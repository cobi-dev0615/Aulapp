package com.gse.aulapp.io;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.gse.aulapp.model.dao.ConfigurationSessionDao;
import com.gse.aulapp.model.dao.GpsDao;
import com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao;
import com.gse.aulapp.model.dao.QuestionDao;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.dao.StepProcessSessionDao;
import com.gse.aulapp.model.dao.TestDao;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/io/ReceptionsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/gse/aulapp/model/dao/SessionDao;", "SessionDao", "()Lcom/gse/aulapp/model/dao/SessionDao;", "Lcom/gse/aulapp/model/dao/StepProcessSessionDao;", "StepProcessSessionDao", "()Lcom/gse/aulapp/model/dao/StepProcessSessionDao;", "Lcom/gse/aulapp/model/dao/HistoricRecordPermissionsChangeDao;", "HistoricRecordPermissionsChangeDao", "()Lcom/gse/aulapp/model/dao/HistoricRecordPermissionsChangeDao;", "Lcom/gse/aulapp/model/dao/GpsDao;", "GpsDao", "()Lcom/gse/aulapp/model/dao/GpsDao;", "Lcom/gse/aulapp/model/dao/TestDao;", "TestDao", "()Lcom/gse/aulapp/model/dao/TestDao;", "Lcom/gse/aulapp/model/dao/QuestionDao;", "QuestionDao", "()Lcom/gse/aulapp/model/dao/QuestionDao;", "Lcom/gse/aulapp/model/dao/ConfigurationSessionDao;", "ConfigurationSessionDao", "()Lcom/gse/aulapp/model/dao/ConfigurationSessionDao;", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ReceptionsDatabase extends RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile ReceptionsDatabase INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/io/ReceptionsDatabase$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "INSTANCE", "Lcom/gse/aulapp/io/ReceptionsDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReceptionsDatabase getDatabase(Context context) {
            ReceptionsDatabase receptionsDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            ReceptionsDatabase receptionsDatabase2 = ReceptionsDatabase.INSTANCE;
            if (receptionsDatabase2 != null) {
                return receptionsDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                receptionsDatabase = (ReceptionsDatabase) Room.databaseBuilder(applicationContext, ReceptionsDatabase.class, "instructor-database").fallbackToDestructiveMigration().build();
                ReceptionsDatabase.INSTANCE = receptionsDatabase;
            }
            return receptionsDatabase;
        }

        private Companion() {
        }
    }

    public abstract ConfigurationSessionDao ConfigurationSessionDao();

    public abstract GpsDao GpsDao();

    public abstract HistoricRecordPermissionsChangeDao HistoricRecordPermissionsChangeDao();

    public abstract QuestionDao QuestionDao();

    public abstract SessionDao SessionDao();

    public abstract StepProcessSessionDao StepProcessSessionDao();

    public abstract TestDao TestDao();
}
