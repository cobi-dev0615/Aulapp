package com.gse.aulapp.service;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.gse.aulapp.util.SaveDbUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.service.LocationService$saveGpsTrackerAndNotificationReport$1", f = "LocationService.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LocationService$saveGpsTrackerAndNotificationReport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Location $location;
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ LocationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationService$saveGpsTrackerAndNotificationReport$1(Location location, LocationService locationService, String str, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$location = location;
        this.this$0 = locationService;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new LocationService$saveGpsTrackerAndNotificationReport$1(this.$location, this.this$0, this.$sessionId, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String unused;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$location != null) {
                unused = this.this$0.TAG;
                Objects.toString(this.$location);
                SaveDbUtil.Companion companion = SaveDbUtil.INSTANCE;
                Context applicationContext = this.this$0.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                String str2 = this.$sessionId;
                Location location = this.$location;
                this.label = 1;
                if (companion.saveGpsTracker(applicationContext, str2, location, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                str = this.this$0.TAG;
                Boxing.boxInt(Log.e(str, "this location is null"));
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocationService$saveGpsTrackerAndNotificationReport$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
