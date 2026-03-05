package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.model.request.SessionInstructorRequest;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$onSwipeRefresh$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$onSwipeRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ FragmentHomeBinding $binding;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onSwipeRefresh$1(HomeViewModel homeViewModel, Activity activity, FragmentHomeBinding fragmentHomeBinding, Continuation<? super HomeViewModel$onSwipeRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
        this.$activity = activity;
        this.$binding = fragmentHomeBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(HomeViewModel homeViewModel, FragmentHomeBinding fragmentHomeBinding, Activity activity, SessionInstructorRequest sessionInstructorRequest) {
        Context context = fragmentHomeBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        homeViewModel.getSessionFromApiAndSave(context, activity, sessionInstructorRequest, BuildConfig.FLAVOR, false, null, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$onSwipeRefresh$1(this.this$0, this.$activity, this.$binding, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final HomeViewModel homeViewModel = this.this$0;
        final Activity activity = this.$activity;
        final FragmentHomeBinding fragmentHomeBinding = this.$binding;
        homeViewModel.getSessionRequest(activity, new Function1() { // from class: com.gse.aulapp.viewmodel.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = HomeViewModel$onSwipeRefresh$1.invokeSuspend$lambda$0(HomeViewModel.this, fragmentHomeBinding, activity, (SessionInstructorRequest) obj2);
                return invokeSuspend$lambda$0;
            }
        });
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$onSwipeRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
