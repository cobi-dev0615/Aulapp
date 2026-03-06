package com.gse.aulapp.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.gse.aulapp.R;
import com.gse.aulapp.util.DefaultLocationClient;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.LocationClient;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u0003J)\u0010!\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u0003R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/gse/aulapp/service/LocationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "interval", BuildConfig.FLAVOR, "sessionId", BuildConfig.FLAVOR, "flags", "startId", BuildConfig.FLAVOR, "start", "(Landroid/content/Intent;JLjava/lang/String;II)V", "messageNotification", "Landroidx/core/app/NotificationCompat$Builder;", "callNotification", "(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;", "Landroid/location/Location;", "location", "notification", "Landroid/app/NotificationManager;", "notificationManager", "saveGpsTrackerAndNotificationReport", "(Landroid/location/Location;Ljava/lang/String;JLandroidx/core/app/NotificationCompat$Builder;Landroid/app/NotificationManager;)V", "stop", "p0", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onCreate", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "TAG", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineScope;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/gse/aulapp/util/LocationClient;", "locationClient", "Lcom/gse/aulapp/util/LocationClient;", "INTERVAL_DEFAULT", "J", BuildConfig.FLAVOR, "isService", "Z", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocationService extends Service {
    private final long INTERVAL_DEFAULT;
    private final String TAG;
    private boolean isService;
    private LocationClient locationClient;
    private final CoroutineScope serviceScope;

    public LocationService() {
        Intrinsics.checkNotNullExpressionValue("LocationService", "getSimpleName(...)");
        this.TAG = "LocationService";
        this.serviceScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob(null).plus(Dispatchers.getMain()));
        this.INTERVAL_DEFAULT = 2500L;
        this.isService = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationCompat.Builder callNotification(String messageNotification) {
        NotificationCompat.Builder ongoing = new NotificationCompat.Builder(this, "location_pw").setContentText(messageNotification).setSmallIcon(R.drawable.ic_aulapp_notification).setOngoing(true);
        Intrinsics.checkNotNullExpressionValue(ongoing, "setOngoing(...)");
        return ongoing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveGpsTrackerAndNotificationReport(Location location, String sessionId, long interval, NotificationCompat.Builder notification, NotificationManager notificationManager) {
        BuildersKt.launch(this.serviceScope, (CoroutineContext) null, (CoroutineStart) null, new LocationService$saveGpsTrackerAndNotificationReport$1(location, this, sessionId, null));
        String valueOf = String.valueOf(location.getLatitude());
        String valueOf2 = String.valueOf(location.getLongitude());
        location.getLatitude();
        location.getLongitude();
        location.getTime();
        location.getAccuracy();
        location.getAltitude();
        location.getBearing();
        location.getSpeed();
        location.getProvider();
        location.getElapsedRealtimeNanos();
        String string = getString(R.string.content_notification_gps);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationCompat.Builder contentText = notification.setContentText(string.replace("[LAT]", valueOf).replace("[LONG]", valueOf2));
        Intrinsics.checkNotNullExpressionValue(contentText, "setContentText(...)");
        notificationManager.notify(10000002, contentText.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.core.app.NotificationCompat$Builder] */
    private final void start(Intent intent, long interval, String sessionId, int flags, int startId) {
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String string = getString(R.string.content_notification_gps);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            objectRef.element = callNotification(string);
            Object systemService = getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            GpsUtil.Companion companion = GpsUtil.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.validateGpsIsActive(applicationContext);
            LocationClient locationClient = this.locationClient;
            if (locationClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("locationClient");
                locationClient = null;
            }
            FlowKt.launchIn(FlowKt.onEach(FlowKt.m1541catch(locationClient.getLocationUpdates(interval), new LocationService$start$1(this, null)), new LocationService$start$2(this, objectRef, notificationManager, intent, flags, startId, sessionId, interval, null)), this.serviceScope);
            startForeground(10000002, ((NotificationCompat.Builder) objectRef.element).build());
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stop() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent p0) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.locationClient = new DefaultLocationClient(applicationContext, fusedLocationProviderClient);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        CoroutineScopeKt.cancel(this.serviceScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:2:0x0000, B:16:0x0040, B:18:0x004b, B:20:0x0051, B:25:0x0063, B:47:0x0039, B:50:0x0006, B:52:0x000c, B:6:0x001d, B:8:0x0025, B:10:0x002b, B:12:0x0034, B:5:0x0017), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:2:0x0000, B:16:0x0040, B:18:0x004b, B:20:0x0051, B:25:0x0063, B:47:0x0039, B:50:0x0006, B:52:0x000c, B:6:0x001d, B:8:0x0025, B:10:0x002b, B:12:0x0034, B:5:0x0017), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[RETURN] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent intent2;
        int i;
        int i2;
        long j;
        Bundle extras;
        Object obj;
        String str;
        Bundle extras2;
        try {
            j = this.INTERVAL_DEFAULT;
        } catch (Exception e) {
            e = e;
            intent2 = intent;
            i = flags;
            i2 = startId;
            e.toString();
            GpsUtil.Companion companion = GpsUtil.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.validateGpsIsActive(applicationContext);
            return super.onStartCommand(intent2, i, i2);
        }
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e2) {
                e2.getMessage();
                str = "9999999999999";
            }
            if (extras != null) {
                obj = extras.get("INTERVAL_KEY");
                if (obj == null) {
                }
                j = ((Long) obj).longValue();
                if (intent != null || (extras2 = intent.getExtras()) == null || (r0 = extras2.get("SESSION_ID_KEY")) == null) {
                    Object obj2 = "9999999999999";
                }
                str = (String) obj2;
                long j2 = j;
                if (intent != null) {
                    intent.getAction();
                }
                if (intent != null) {
                    return 2;
                }
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    try {
                        if (hashCode == -528730005) {
                            intent2 = intent;
                            i = flags;
                            i2 = startId;
                            if (action.equals("ACTION_STOP")) {
                                stop();
                            }
                        } else if (hashCode == 789225721) {
                            if (action.equals("ACTION_START")) {
                                intent2 = intent;
                                i = flags;
                                i2 = startId;
                                start(intent2, j2, str, i, i2);
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        e.toString();
                        GpsUtil.Companion companion2 = GpsUtil.INSTANCE;
                        Context applicationContext2 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                        companion2.validateGpsIsActive(applicationContext2);
                        return super.onStartCommand(intent2, i, i2);
                    }
                    GpsUtil.Companion companion22 = GpsUtil.INSTANCE;
                    Context applicationContext22 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext22, "getApplicationContext(...)");
                    companion22.validateGpsIsActive(applicationContext22);
                    return super.onStartCommand(intent2, i, i2);
                }
                intent2 = intent;
                i = flags;
                i2 = startId;
                GpsUtil.Companion companion222 = GpsUtil.INSTANCE;
                Context applicationContext222 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext222, "getApplicationContext(...)");
                companion222.validateGpsIsActive(applicationContext222);
                return super.onStartCommand(intent2, i, i2);
            }
        }
        obj = Long.valueOf(this.INTERVAL_DEFAULT);
        j = ((Long) obj).longValue();
        if (intent != null) {
        }
        Object obj22 = "9999999999999";
        str = (String) obj22;
        long j22 = j;
        if (intent != null) {
        }
        if (intent != null) {
        }
    }
}
