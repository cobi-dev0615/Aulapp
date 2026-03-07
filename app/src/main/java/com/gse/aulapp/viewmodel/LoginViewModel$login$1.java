package com.gse.aulapp.viewmodel;

import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.databinding.FragmentLoginBinding;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.DataLoginDto;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.LoginRepository;
import com.gse.aulapp.model.request.LoginRequest;
import com.gse.aulapp.model.response.LoginResponse;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.LoginViewModel$login$1", f = "LoginViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class LoginViewModel$login$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentLoginBinding $binding;
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ LoginRequest $loginRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/LoginResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.LoginViewModel$login$1$1", f = "LoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.LoginViewModel$login$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends LoginResponse>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoginViewModel loginViewModel, Continuation<?> continuation) {
            super(3, continuation);
            this.this$0 = loginViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends LoginResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<LoginResponse>>) flowCollector, th, continuation);
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
        public final Object invoke2(FlowCollector<? super ApiResult<LoginResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$login$1(LoginViewModel loginViewModel, LoginRequest loginRequest, FragmentActivity fragmentActivity, FragmentLoginBinding fragmentLoginBinding, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginViewModel;
        this.$loginRequest = loginRequest;
        this.$context = fragmentActivity;
        this.$binding = fragmentLoginBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LoginViewModel$login$1 loginViewModel$login$1 = new LoginViewModel$login$1(this.this$0, this.$loginRequest, this.$context, this.$binding, continuation);
        loginViewModel$login$1.L$0 = obj;
        return loginViewModel$login$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        LoginRepository loginRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            mutableStateFlow = this.this$0._message;
            mutableStateFlow.setValue(new Status.Loading(false, 1, null));
            if (this.$loginRequest != null) {
                loginRepository = this.this$0.loginRepository;
                Flow m1541catch = FlowKt.m1541catch(loginRepository.login(this.$context, this.$loginRequest), new AnonymousClass1(this.this$0, null));
                final LoginRequest loginRequest = this.$loginRequest;
                final FragmentActivity fragmentActivity = this.$context;
                final LoginViewModel loginViewModel = this.this$0;
                final FragmentLoginBinding fragmentLoginBinding = this.$binding;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.LoginViewModel$login$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation<? super Unit> continuation) {
                        return emit((ApiResult<LoginResponse>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ApiResult<LoginResponse> apiResult, Continuation<? super Unit> continuation) {
                        MutableStateFlow mutableStateFlow3;
                        MutableStateFlow mutableStateFlow4;
                        MutableStateFlow mutableStateFlow5;
                        MutableStateFlow mutableStateFlow6;
                        DataLoginDto data;
                        DataLoginDto data2;
                        LoginResponse.Result result;
                        if (apiResult.getStatus() == EnumApiStatus.SUCCESS) {
                            LoginResponse data3 = apiResult.getData();
                            String str = null;
                            if (((data3 == null || (result = data3.getResult()) == null) ? null : result.getToken()) != null) {
                                LoginResponse.Result result2 = apiResult.getData().getResult();
                                String token = result2 != null ? result2.getToken() : null;
                                Intrinsics.checkNotNull(token);
                                LoginResponse.Result result3 = apiResult.getData().getResult();
                                String id = (result3 == null || (data2 = result3.getData()) == null) ? null : data2.getId();
                                String username = LoginRequest.this.getUsername();
                                PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
                                companion.saveUserId(fragmentActivity, id);
                                FragmentActivity fragmentActivity2 = fragmentActivity;
                                LoginViewModel loginViewModel2 = loginViewModel;
                                FragmentLoginBinding fragmentLoginBinding2 = fragmentLoginBinding;
                                companion.saveToken(fragmentActivity2, token);
                                if (username != null) {
                                    companion.saveEmail(fragmentActivity2, username);
                                }
                                LoginResponse.Result result4 = apiResult.getData().getResult();
                                if (result4 != null && (data = result4.getData()) != null) {
                                    str = data.getFullName();
                                }
                                companion.saveUserName(fragmentActivity2, str);
                                mutableStateFlow6 = loginViewModel2._message;
                                mutableStateFlow6.setValue(new Status.Success(token));
                                fragmentLoginBinding2.mtvInformationLogin.setVisibility(4);
                            } else {
                                mutableStateFlow5 = loginViewModel._message;
                                mutableStateFlow5.setValue(Status.Empty.INSTANCE);
                            }
                        } else if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                            Integer statusCode = apiResult.getStatusCode();
                            if (statusCode != null && statusCode.intValue() == 401) {
                                mutableStateFlow4 = loginViewModel._message;
                                mutableStateFlow4.setValue(new Status.Failure(new Exception("401")));
                            } else {
                                mutableStateFlow3 = loginViewModel._message;
                                mutableStateFlow3.setValue(new Status.Failure(new Exception(apiResult.getMessage())));
                            }
                            fragmentLoginBinding.mtvInformationLogin.setText((CharSequence) new JSONObject(String.valueOf(apiResult.getMessage())).get("message"));
                            fragmentLoginBinding.mtvInformationLogin.setVisibility(0);
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
        return ((LoginViewModel$login$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
