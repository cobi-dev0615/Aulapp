package com.gse.aulapp.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.gse.aulapp.util.LocationClient;
import com.gse.aulapp.util.extension.ContextExtKt;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/location/Location;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.DefaultLocationClient$getLocationUpdates$1", f = "DefaultLocationClient.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultLocationClient$getLocationUpdates$1 extends SuspendLambda implements Function2<ProducerScope<? super Location>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $interval;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultLocationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLocationClient$getLocationUpdates$1(DefaultLocationClient defaultLocationClient, long j, Continuation<? super DefaultLocationClient$getLocationUpdates$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultLocationClient;
        this.$interval = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(DefaultLocationClient defaultLocationClient, DefaultLocationClient$getLocationUpdates$1$callback$1 defaultLocationClient$getLocationUpdates$1$callback$1) {
        FusedLocationProviderClient fusedLocationProviderClient;
        fusedLocationProviderClient = defaultLocationClient.client;
        fusedLocationProviderClient.removeLocationUpdates(defaultLocationClient$getLocationUpdates$1$callback$1);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultLocationClient$getLocationUpdates$1 defaultLocationClient$getLocationUpdates$1 = new DefaultLocationClient$getLocationUpdates$1(this.this$0, this.$interval, continuation);
        defaultLocationClient$getLocationUpdates$1.L$0 = obj;
        return defaultLocationClient$getLocationUpdates$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        FusedLocationProviderClient fusedLocationProviderClient;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            context = this.this$0.context;
            if (!ContextExtKt.hasLocationPermission(context)) {
                throw new LocationClient.LocationException("No tiene permiso(s) GPS");
            }
            context2 = this.this$0.context;
            Object systemService = context2.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            LocationManager locationManager = (LocationManager) systemService;
            if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                throw new LocationClient.LocationException("GPS está desactivado");
            }
            LocationRequest build = new LocationRequest.Builder(this.$interval).setPriority(100).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            final DefaultLocationClient defaultLocationClient = this.this$0;
            LocationCallback locationCallback = new LocationCallback() { // from class: com.gse.aulapp.util.DefaultLocationClient$getLocationUpdates$1$callback$1
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
                
                    if (r0 < r1) goto L17;
                 */
                @Override // com.google.android.gms.location.LocationCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onLocationResult(LocationResult result) {
                    boolean z;
                    KalmanFilter kalmanFilter;
                    Location location;
                    float f;
                    float f2;
                    Intrinsics.checkNotNullParameter(result, "result");
                    Location lastLocation = result.getLastLocation();
                    if (lastLocation == null) {
                        return;
                    }
                    z = DefaultLocationClient.this.isGpsReady;
                    if (!z) {
                        float accuracy = lastLocation.getAccuracy();
                        f2 = DefaultLocationClient.this.MIN_INITIAL_ACCURACY;
                        if (accuracy > f2) {
                            return;
                        } else {
                            DefaultLocationClient.this.isGpsReady = true;
                        }
                    }
                    kalmanFilter = DefaultLocationClient.this.kalmanSpeed;
                    float update = kalmanFilter.update(lastLocation.getSpeed());
                    if (lastLocation.hasSpeedAccuracy() && lastLocation.getSpeedAccuracyMetersPerSecond() < 0.5f) {
                        f = DefaultLocationClient.this.SPEED_THRESHOLD;
                    }
                    update = 0.0f;
                    Location location2 = new Location(lastLocation);
                    location2.setSpeed(update);
                    location2.setLatitude(lastLocation.getLatitude());
                    location2.setLongitude(lastLocation.getLongitude());
                    location = DefaultLocationClient.this.oldLocation;
                    if (location != null && update == 0.0f) {
                        location2.setLatitude(location.getLatitude());
                        location2.setLongitude(location.getLongitude());
                    }
                    DefaultLocationClient.this.oldLocation = location2;
                    ProducerScope<Location> producerScope2 = producerScope;
                    BuildersKt.launch$default(producerScope2, null, null, new DefaultLocationClient$getLocationUpdates$1$callback$1$onLocationResult$2(producerScope2, location2, null), 3, null);
                }
            };
            fusedLocationProviderClient = this.this$0.client;
            fusedLocationProviderClient.requestLocationUpdates(build, locationCallback, Looper.getMainLooper());
            a aVar = new a(this.this$0, locationCallback, 0);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Location> producerScope, Continuation<? super Unit> continuation) {
        return ((DefaultLocationClient$getLocationUpdates$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
