package com.gse.aulapp.service;

import android.location.Location;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Landroid/location/Location;", "it", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.service.LocationService$start$1", f = "LocationService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LocationService$start$1 extends SuspendLambda implements Function3<FlowCollector<? super Location>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationService$start$1(LocationService locationService, Continuation continuation) {
        super(3, (Continuation<Object>) continuation);
        this.this$0 = locationService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String unused;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.L$0;
        unused = this.this$0.TAG;
        th.getMessage();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Location> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        LocationService$start$1 locationService$start$1 = new LocationService$start$1(this.this$0, (Continuation) continuation);
        locationService$start$1.L$0 = th;
        return locationService$start$1.invokeSuspend(Unit.INSTANCE);
    }
}
