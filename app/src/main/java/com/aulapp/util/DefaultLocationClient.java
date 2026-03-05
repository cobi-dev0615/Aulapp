package com.gse.aulapp.util;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/gse/aulapp/util/DefaultLocationClient;", "Lcom/gse/aulapp/util/LocationClient;", "context", "Landroid/content/Context;", "client", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "<init>", "(Landroid/content/Context;Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "kalmanSpeed", "Lcom/gse/aulapp/util/KalmanFilter;", "MIN_INITIAL_ACCURACY", BuildConfig.FLAVOR, "SPEED_THRESHOLD", "isGpsReady", BuildConfig.FLAVOR, "oldLocation", "Landroid/location/Location;", "getLocationUpdates", "Lkotlinx/coroutines/flow/Flow;", "interval", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLocationClient implements LocationClient {
    private final float MIN_INITIAL_ACCURACY;
    private final float SPEED_THRESHOLD;
    private final FusedLocationProviderClient client;
    private final Context context;
    private boolean isGpsReady;
    private final KalmanFilter kalmanSpeed;
    private Location oldLocation;

    public DefaultLocationClient(Context context, FusedLocationProviderClient client) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        this.context = context;
        this.client = client;
        this.kalmanSpeed = new KalmanFilter();
        this.MIN_INITIAL_ACCURACY = 20.0f;
        this.SPEED_THRESHOLD = 0.7f;
    }

    @Override // com.gse.aulapp.util.LocationClient
    public Flow<Location> getLocationUpdates(long interval) {
        return FlowKt.callbackFlow(new DefaultLocationClient$getLocationUpdates$1(this, interval, null));
    }
}
