package com.gse.aulapp;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.work.Configuration;
import co.ceduladigital.sdk.f3;
import co.ceduladigital.sdk.j3;
import com.gse.aulapp.io.ReceptionsDatabase;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/gse/aulapp/GeneralApp;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "<init>", "()V", BuildConfig.FLAVOR, "initializeTrustedTimeClient", "onCreate", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GeneralApp extends Application implements Configuration.Provider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static ReceptionsDatabase database;
    public static GeneralApp instance;
    private static Object trustedTimeClient;
    private final String TAG = "GeneralApp";
    private final CoroutineScope applicationScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null));

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/gse/aulapp/GeneralApp$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/gse/aulapp/GeneralApp;", "instance", "Lcom/gse/aulapp/GeneralApp;", "getInstance", "()Lcom/gse/aulapp/GeneralApp;", "setInstance", "(Lcom/gse/aulapp/GeneralApp;)V", "Lcom/gse/aulapp/io/ReceptionsDatabase;", "database", "Lcom/gse/aulapp/io/ReceptionsDatabase;", "getDatabase", "()Lcom/gse/aulapp/io/ReceptionsDatabase;", "setDatabase", "(Lcom/gse/aulapp/io/ReceptionsDatabase;)V", "Lcom/google/android/gms/time/TrustedTimeClient;", "trustedTimeClient", "Lcom/google/android/gms/time/TrustedTimeClient;", "getTrustedTimeClient", "()Lcom/google/android/gms/time/TrustedTimeClient;", "setTrustedTimeClient", "(Lcom/google/android/gms/time/TrustedTimeClient;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReceptionsDatabase getDatabase() {
            ReceptionsDatabase receptionsDatabase = GeneralApp.database;
            if (receptionsDatabase != null) {
                return receptionsDatabase;
            }
            Intrinsics.throwUninitializedPropertyAccessException("database");
            return null;
        }

        public final GeneralApp getInstance() {
            GeneralApp generalApp = GeneralApp.instance;
            if (generalApp != null) {
                return generalApp;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            return null;
        }

        public final Object getTrustedTimeClient() {
            return GeneralApp.trustedTimeClient;
        }

        public final void setDatabase(ReceptionsDatabase receptionsDatabase) {
            Intrinsics.checkNotNullParameter(receptionsDatabase, "<set-?>");
            GeneralApp.database = receptionsDatabase;
        }

        public final void setInstance(GeneralApp generalApp) {
            Intrinsics.checkNotNullParameter(generalApp, "<set-?>");
            GeneralApp.instance = generalApp;
        }

        private Companion() {
        }
    }

    private final void initializeTrustedTimeClient() {
        // TrustedTime.createClient(this).addOnSuccessListener(new j3(new f3(3), 4)).addOnFailureListener(new j3(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeTrustedTimeClient$lambda$0(Object trustedTimeClient2) {
        trustedTimeClient = trustedTimeClient2;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeTrustedTimeClient$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeTrustedTimeClient$lambda$2(GeneralApp this$0, Exception exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String str = this$0.TAG;
        trustedTimeClient = null;
    }

    @Override // androidx.work.Configuration.Provider
    public Configuration getWorkManagerConfiguration() {
        Configuration build = new Configuration.Builder().setMinimumLoggingLevel(5).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        companion.setInstance(this);
        companion.setDatabase(ReceptionsDatabase.INSTANCE.getDatabase(companion.getInstance()));
        NotificationChannel notificationChannel = new NotificationChannel("location_pw", "location_pw", 2);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        initializeTrustedTimeClient();
    }
}
