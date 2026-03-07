package com.gse.aulapp.viewmodel;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.model.request.PasswordRecoveryRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.PasswordRecoveryResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$recoverPassword$1", f = "FirstLoginViewModel.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FirstLoginViewModel$recoverPassword$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $email;
    int label;
    final /* synthetic */ FirstLoginViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/PasswordRecoveryResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$recoverPassword$1$1", f = "FirstLoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.FirstLoginViewModel$recoverPassword$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends PasswordRecoveryResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FirstLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, FirstLoginViewModel firstLoginViewModel, Continuation<?> continuation) {
            super(3, continuation);
            this.$context = context;
            this.this$0 = firstLoginViewModel;
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
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("recoverPassword exception: ", th.getMessage()), "recoverPassword", true);
            mutableStateFlow = this.this$0._messagePasswordRecovery;
            mutableStateFlow.setValue(new Status.Failure(th));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<PasswordRecoveryResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstLoginViewModel$recoverPassword$1(FirstLoginViewModel firstLoginViewModel, String str, Context context, Continuation continuation) {
        super(2, continuation);
        this.this$0 = firstLoginViewModel;
        this.$email = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new FirstLoginViewModel$recoverPassword$1(this.this$0, this.$email, this.$context, continuation);
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
            mutableStateFlow = this.this$0._messagePasswordRecovery;
            mutableStateFlow.setValue(new Status.Loading(false, 1, null));
            if (this.$email.length() > 0) {
                LogSendUtil.INSTANCE.setLog(this.$context, q.i("recoverPassword request: ", this.$email), null, false);
                PasswordRecoveryRequest passwordRecoveryRequest = new PasswordRecoveryRequest(this.$email);
                passwordRecoveryRepository = this.this$0.passwordRecoveryRepository;
                Context applicationContext = GeneralApp.INSTANCE.getInstance().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                Flow m1541catch = passwordRecoveryRepository.passwordRecovery(applicationContext, passwordRecoveryRequest);
                final Context context = this.$context;
                final FirstLoginViewModel firstLoginViewModel = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.FirstLoginViewModel$recoverPassword$1.2

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: com.gse.aulapp.viewmodel.FirstLoginViewModel$recoverPassword$1$2$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumApiStatus.values().length];
                            try {
                                iArr[EnumApiStatus.SUCCESS.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[EnumApiStatus.ERROR.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[EnumApiStatus.EXCEPTION.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ApiResult<PasswordRecoveryResponse>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ApiResult<PasswordRecoveryResponse> apiResult, Continuation continuation) {
                        MutableStateFlow mutableStateFlow3;
                        PasswordRecoveryResponse.Result result;
                        PasswordRecoveryResponse.Result result2;
                        MutableStateFlow mutableStateFlow4;
                        PasswordRecoveryResponse.Result result3;
                        MutableStateFlow mutableStateFlow5;
                        MutableStateFlow mutableStateFlow6;
                        MutableStateFlow mutableStateFlow7;
                        MutableStateFlow mutableStateFlow8;
                        PasswordRecoveryResponse.Result result4;
                        PasswordRecoveryResponse data = apiResult.getData();
                        String str = null;
                        str = null;
                        String message = (data == null || (result4 = data.getResult()) == null) ? null : result4.getMessage();
                        int i2 = WhenMappings.$EnumSwitchMapping$0[apiResult.getStatus().ordinal()];
                        if (i2 == 1) {
                            Context context2 = context;
                            FirstLoginViewModel firstLoginViewModel2 = firstLoginViewModel;
                            if (message != null) {
                                LogSendUtil.INSTANCE.setLog(context2, "recoverPassword Success: " + message + ", url: " + apiResult.getData().getUrl(), null, false);
                                PasswordRecoveryResponse data2 = apiResult.getData();
                                if ((data2 == null || (result3 = data2.getResult()) == null) ? false : Intrinsics.areEqual(result3.getSuccess(), Boxing.boxBoolean(true))) {
                                    mutableStateFlow4 = firstLoginViewModel2._messagePasswordRecovery;
                                    mutableStateFlow4.setValue(new Status.Success(message));
                                } else {
                                    PasswordRecoveryResponse data3 = apiResult.getData();
                                    String message2 = (data3 == null || (result2 = data3.getResult()) == null) ? null : result2.getMessage();
                                    PasswordRecoveryResponse data4 = apiResult.getData();
                                    if (data4 != null && (result = data4.getResult()) != null) {
                                        str = result.getCode();
                                    }
                                    ErrorResponse errorEndpoint = firstLoginViewModel2.getErrorEndpoint(message2, str);
                                    mutableStateFlow3 = firstLoginViewModel2._messagePasswordRecovery;
                                    mutableStateFlow3.setValue(new Status.Exception(errorEndpoint));
                                }
                            }
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                            Context context3 = context;
                            PasswordRecoveryResponse data5 = apiResult.getData();
                            companion.setLog(context3, "recoverPassword exception: " + (data5 != null ? data5.getResult() : null), "recoverPassword", true);
                            mutableStateFlow8 = firstLoginViewModel._messagePasswordRecovery;
                            PasswordRecoveryResponse data6 = apiResult.getData();
                            mutableStateFlow8.setValue(new Status.Exception(String.valueOf(data6 != null ? data6.getResult() : null)));
                        } else if (message != null) {
                            LogSendUtil.INSTANCE.setLog(context, "recoverPassword Error: " + message + ", url: " + apiResult.getData().getUrl(), null, false);
                            ErrorResponse errorEndpoint2 = firstLoginViewModel.getErrorEndpoint(apiResult.getMessage(), null);
                            mutableStateFlow7 = firstLoginViewModel._messagePasswordRecovery;
                            mutableStateFlow7.setValue(new Status.Exception(errorEndpoint2));
                        } else {
                            try {
                                ErrorResponse errorEndpoint3 = firstLoginViewModel.getErrorEndpoint(new JSONObject(String.valueOf(apiResult.getMessage())).get("message").toString(), null);
                                mutableStateFlow6 = firstLoginViewModel._messagePasswordRecovery;
                                mutableStateFlow6.setValue(new Status.Exception(errorEndpoint3));
                            } catch (Exception e) {
                                LogSendUtil.INSTANCE.setLog(context, q.i("recoverPassword exception: ", e.getMessage()), "recoverPassword", true);
                                mutableStateFlow5 = firstLoginViewModel._messagePasswordRecovery;
                                mutableStateFlow5.setValue(new Status.Failure(new Exception("Sin respuesta del servicio")));
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
                LogSendUtil.INSTANCE.setLog(this.$context, "recoverPassword exception: Registre el campo de usuario", "recoverPassword", true);
                mutableStateFlow2 = this.this$0._messagePasswordRecovery;
                mutableStateFlow2.setValue(new Status.Failure(new Exception("Registre el campo de usuario")));
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
        return ((FirstLoginViewModel$recoverPassword$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
