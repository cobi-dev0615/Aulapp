package com.gse.aulapp.viewmodel;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.databinding.FragmentPasswordRecoverBinding;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.model.request.PasswordRecoveryRequest;
import com.gse.aulapp.model.response.PasswordRecoveryResponse;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PasswordRecoverViewModel$callAPIPasswordRecovery$1", f = "PasswordRecoverViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PasswordRecoverViewModel$callAPIPasswordRecovery$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentPasswordRecoverBinding $binding;
    final /* synthetic */ Context $context;
    final /* synthetic */ PasswordRecoveryRequest $passwordRecoveryRequest;
    int label;
    final /* synthetic */ PasswordRecoverViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/PasswordRecoveryResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.PasswordRecoverViewModel$callAPIPasswordRecovery$1$1", f = "PasswordRecoverViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.PasswordRecoverViewModel$callAPIPasswordRecovery$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends PasswordRecoveryResponse>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PasswordRecoverViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PasswordRecoverViewModel passwordRecoverViewModel, Continuation<?> continuation) {
            super(3, continuation);
            this.this$0 = passwordRecoverViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends PasswordRecoveryResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<PasswordRecoveryResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            mutableStateFlow = this.this$0._message;
            mutableStateFlow.setValue(new Status.Failure(th));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<PasswordRecoveryResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordRecoverViewModel$callAPIPasswordRecovery$1(PasswordRecoverViewModel passwordRecoverViewModel, PasswordRecoveryRequest passwordRecoveryRequest, Context context, FragmentPasswordRecoverBinding fragmentPasswordRecoverBinding, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passwordRecoverViewModel;
        this.$passwordRecoveryRequest = passwordRecoveryRequest;
        this.$context = context;
        this.$binding = fragmentPasswordRecoverBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasswordRecoverViewModel$callAPIPasswordRecovery$1(this.this$0, this.$passwordRecoveryRequest, this.$context, this.$binding, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        PasswordRecoveryRepository passwordRecoveryRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._message;
            mutableStateFlow.setValue(new Status.Loading(false, 1, null));
            if (this.$passwordRecoveryRequest != null) {
                passwordRecoveryRepository = this.this$0.passwordRecoveryRepository;
                Context context = this.$context;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Flow m1541catch = FlowKt.m1541catch(passwordRecoveryRepository.passwordRecovery((FragmentActivity) context, this.$passwordRecoveryRequest), new AnonymousClass1(this.this$0, null));
                final FragmentPasswordRecoverBinding fragmentPasswordRecoverBinding = this.$binding;
                final PasswordRecoverViewModel passwordRecoverViewModel = this.this$0;
                final Context context2 = this.$context;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.PasswordRecoverViewModel$callAPIPasswordRecovery$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ApiResult<PasswordRecoveryResponse>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ApiResult<PasswordRecoveryResponse> apiResult, Continuation continuation) {
                        FragmentPasswordRecoverBinding.this.mtvInformationRecovery.setText(BuildConfig.FLAVOR);
                        FragmentPasswordRecoverBinding.this.mtvInformationRecovery.setVisibility(4);
                        if (apiResult.getStatus() == EnumApiStatus.SUCCESS) {
                            passwordRecoverViewModel.callDialog(true, context2);
                        } else if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                            JSONObject jSONObject = new JSONObject(String.valueOf(apiResult.getMessage()));
                            if (Intrinsics.areEqual(jSONObject.get("status"), Boxing.boxInt(400))) {
                                FragmentPasswordRecoverBinding.this.mtvInformationRecovery.setText((CharSequence) jSONObject.get("message"));
                                FragmentPasswordRecoverBinding.this.mtvInformationRecovery.setVisibility(0);
                            } else {
                                passwordRecoverViewModel.callDialog(false, context2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (m1541catch.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                mutableStateFlow2 = this.this$0._message;
                mutableStateFlow2.setValue(new Status.Failure(new Exception("User or pass is null")));
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
        return ((PasswordRecoverViewModel$callAPIPasswordRecovery$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
