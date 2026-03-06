package com.gse.aulapp.service;

import android.app.NotificationManager;
import android.content.Intent;
import android.location.Location;
import androidx.core.app.NotificationCompat;
import com.gse.aulapp.util.GpsUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "location", "Landroid/location/Location;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.service.LocationService$start$2", f = "LocationService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LocationService$start$2 extends SuspendLambda implements Function2<Location, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $flags;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ long $interval;
    final /* synthetic */ Ref.ObjectRef<NotificationCompat.Builder> $notification;
    final /* synthetic */ NotificationManager $notificationManager;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ int $startId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationService$start$2(LocationService locationService, Ref.ObjectRef<NotificationCompat.Builder> objectRef, NotificationManager notificationManager, Intent intent, int i, int i2, String str, long j, Continuation<? super LocationService$start$2> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.this$0 = locationService;
        this.$notification = objectRef;
        this.$notificationManager = notificationManager;
        this.$intent = intent;
        this.$flags = i;
        this.$startId = i2;
        this.$sessionId = str;
        this.$interval = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, androidx.core.app.NotificationCompat$Builder] */
    public static final Unit invokeSuspend$lambda$0(LocationService locationService, Ref.ObjectRef objectRef, NotificationManager notificationManager, Intent intent, int i, int i2, Location location, String str, long j, boolean z) {
        boolean z2;
        Object callNotification;
        String unused;
        unused = locationService.TAG;
        if (z) {
            locationService.stop();
            callNotification = locationService.callNotification("Hemos detectado el uso de un simulador");
            objectRef.element = callNotification;
            notificationManager.notify(10000002, ((NotificationCompat.Builder) callNotification).build());
            locationService.isService = false;
        } else {
            z2 = locationService.isService;
            if (z2) {
                locationService.saveGpsTrackerAndNotificationReport(location, str, j, (NotificationCompat.Builder) objectRef.element, notificationManager);
            } else {
                locationService.onStartCommand(intent, i, i2);
                locationService.isService = true;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocationService$start$2 locationService$start$2 = new LocationService$start$2(this.this$0, this.$notification, this.$notificationManager, this.$intent, this.$flags, this.$startId, this.$sessionId, this.$interval, (Continuation) continuation);
        locationService$start$2.L$0 = obj;
        return (Continuation<Unit>) (Object) locationService$start$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Location location, Continuation<? super Unit> continuation) {
        return ((LocationService$start$2) (Object) create(location, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String unused;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final Location location = (Location) this.L$0;
        try {
            GpsUtil.Companion companion = GpsUtil.INSTANCE;
            final LocationService locationService = this.this$0;
            final Ref.ObjectRef<NotificationCompat.Builder> objectRef = this.$notification;
            final NotificationManager notificationManager = this.$notificationManager;
            final Intent intent = this.$intent;
            final int i = this.$flags;
            final int i2 = this.$startId;
            final String str = this.$sessionId;
            final long j = this.$interval;
            companion.locationEnabled(locationService, new Function1() { // from class: com.gse.aulapp.service.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    invokeSuspend$lambda$0 = LocationService$start$2.invokeSuspend$lambda$0(locationService, objectRef, notificationManager, intent, i, i2, location, str, j, booleanValue);
                    return invokeSuspend$lambda$0;
                }
            });
        } catch (Exception e) {
            unused = this.this$0.TAG;
            e.getMessage();
        }
        return Unit.INSTANCE;
    }
}
