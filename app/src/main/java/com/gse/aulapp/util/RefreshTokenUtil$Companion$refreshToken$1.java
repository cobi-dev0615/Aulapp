package com.gse.aulapp.util;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.dto.RefreshToken;
import com.gse.aulapp.model.repository.RefreshTokenRepository;
import com.gse.aulapp.model.request.RefreshTokenRequest;
import com.gse.aulapp.model.response.RefreshTokenResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.RefreshTokenUtil$Companion$refreshToken$1", f = "RefreshTokenUtil.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class RefreshTokenUtil$Companion$refreshToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<RefreshTokenRequest> $refreshTokenRequest;
    int label;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/RefreshTokenResponse;", "it", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.util.RefreshTokenUtil$Companion$refreshToken$1$1", f = "RefreshTokenUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.util.RefreshTokenUtil$Companion$refreshToken$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends RefreshTokenResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Continuation<?> continuation) {
            super(3, (Continuation) continuation);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends RefreshTokenResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<RefreshTokenResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("refreshToken exception: ", th.getMessage()), "refreshToken", true);
            DialogUtil.INSTANCE.showErrorGeneralDialogGlobal(this.$context, th.getMessage());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<RefreshTokenResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshTokenUtil$Companion$refreshToken$1(Ref.ObjectRef<RefreshTokenRequest> objectRef, Context context, Continuation continuation) {
        super(2, continuation);
        this.$refreshTokenRequest = objectRef;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new RefreshTokenUtil$Companion$refreshToken$1(this.$refreshTokenRequest, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RefreshTokenRepository refreshTokenRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RefreshTokenRequest refreshTokenRequest = this.$refreshTokenRequest.element;
            if (refreshTokenRequest != null) {
                LogSendUtil.INSTANCE.setLog(this.$context, "refreshToken request: " + refreshTokenRequest, null, false);
                refreshTokenRepository = RefreshTokenUtil.RefreshTokenRepository;
                Flow m1541catch = refreshTokenRepository.refreshToken(this.$context, this.$refreshTokenRequest.element);
                final Context context = this.$context;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.util.RefreshTokenUtil$Companion$refreshToken$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ApiResult<RefreshTokenResponse>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(ApiResult<RefreshTokenResponse> apiResult, Continuation continuation) {
                        RefreshToken data;
                        if (apiResult instanceof ApiResult.Failure) {
                            ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                            LogSendUtil.INSTANCE.setLog(context, q.i("refreshToken error: ", failure.getMessage()), null, false);
                            DialogUtil.INSTANCE.showErrorGeneralDialogGlobal(context, failure.getMessage());
                        } else {
                            if (!(apiResult instanceof ApiResult.Success)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                            Context context2 = context;
                            ApiResult.Success success = (ApiResult.Success) apiResult;
                            RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) success.getData();
                            String str = null;
                            RefreshTokenResponse.Result result = refreshTokenResponse != null ? refreshTokenResponse.getResult() : null;
                            RefreshTokenResponse refreshTokenResponse2 = (RefreshTokenResponse) success.getData();
                            companion.setLog(context2, "refreshToken Success: " + result + ", url " + (refreshTokenResponse2 != null ? refreshTokenResponse2.getUrl() : null), null, false);
                            RefreshTokenResponse refreshTokenResponse3 = (RefreshTokenResponse) success.getData();
                            if ((refreshTokenResponse3 != null ? refreshTokenResponse3.getResult() : null) != null) {
                                PreferenceUtil.Companion companion2 = PreferenceUtil.INSTANCE;
                                Context context3 = context;
                                RefreshTokenResponse.Result result2 = ((RefreshTokenResponse) success.getData()).getResult();
                                companion2.saveToken(context3, result2 != null ? result2.getToken() : null);
                                Context context4 = context;
                                RefreshTokenResponse.Result result3 = ((RefreshTokenResponse) success.getData()).getResult();
                                if (result3 != null && (data = result3.getData()) != null) {
                                    str = data.getId();
                                }
                                companion2.saveUserId(context4, str);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (m1541catch.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((RefreshTokenUtil$Companion$refreshToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
