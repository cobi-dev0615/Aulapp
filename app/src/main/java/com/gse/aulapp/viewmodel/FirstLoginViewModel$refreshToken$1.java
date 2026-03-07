package com.gse.aulapp.viewmodel;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.converter.FingerToHandConverter;
import com.gse.aulapp.model.converter.ProfileUserConverter;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.model.dto.RefreshToken;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumTypeOfIncome;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.repository.RefreshTokenRepository;
import com.gse.aulapp.model.request.RefreshTokenRequest;
import com.gse.aulapp.model.response.RefreshTokenResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Map;
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
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshToken$1", f = "FirstLoginViewModel.kt", i = {}, l = {165, 182, 333}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FirstLoginViewModel$refreshToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RefreshTokenRequest $tokenRefreshRequest;
    int label;
    final /* synthetic */ FirstLoginViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/RefreshTokenResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshToken$1$1", f = "FirstLoginViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshToken$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends RefreshTokenResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ RefreshTokenRequest $tokenRefreshRequest;
        int label;
        final /* synthetic */ FirstLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, RefreshTokenRequest refreshTokenRequest, FirstLoginViewModel firstLoginViewModel, Continuation<?> continuation) {
            super(3, continuation);
            this.$context = context;
            this.$tokenRefreshRequest = refreshTokenRequest;
            this.this$0 = firstLoginViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends RefreshTokenResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<RefreshTokenResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LogSendUtil.INSTANCE.setLog(this.$context, "refreshToken exception: " + this.$tokenRefreshRequest, "refreshToken", true);
                mutableSharedFlow = this.this$0._messageRefreshToken;
                Status.Failure failure = new Status.Failure(new Exception("Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo."));
                this.label = 1;
                if (mutableSharedFlow.emit(failure, this) == coroutine_suspended) {
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<RefreshTokenResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass1(this.$context, this.$tokenRefreshRequest, this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstLoginViewModel$refreshToken$1(FirstLoginViewModel firstLoginViewModel, RefreshTokenRequest refreshTokenRequest, Context context, Continuation continuation) {
        super(2, continuation);
        this.this$0 = firstLoginViewModel;
        this.$tokenRefreshRequest = refreshTokenRequest;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FirstLoginViewModel$refreshToken$1(this.this$0, this.$tokenRefreshRequest, this.$context, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        if (r13.collect(r1, r12) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        if (r13.emit(r1, r12) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r13.emit(r1, r12) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        RefreshTokenRepository refreshTokenRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._messageRefreshToken;
            Status.Loading loading = new Status.Loading(false, 1, null);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Parameters.INSTANCE.setPARAMETER_TYPE_LOGGIN(EnumTypeOfIncome.REFRESHTOKEN);
        RefreshTokenRequest refreshTokenRequest = this.$tokenRefreshRequest;
        if (refreshTokenRequest != null) {
            LogSendUtil.INSTANCE.setLog(this.$context, "refreshToken request: " + refreshTokenRequest, null, false);
            refreshTokenRepository = this.this$0.tokenRefreshRepository;
            Flow m1541catch = FlowKt.m1541catch(refreshTokenRepository.refreshToken(this.$context, this.$tokenRefreshRequest), new AnonymousClass1(this.$context, this.$tokenRefreshRequest, this.this$0, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.this$0);
            this.label = 2;
        } else {
            LogSendUtil.INSTANCE.setLog(this.$context, "refreshToken error: User or pass is null", null, false);
            mutableSharedFlow2 = this.this$0._messageRefreshToken;
            Status.Failure failure = new Status.Failure(new Exception("User or pass is null"));
            this.label = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FirstLoginViewModel$refreshToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFirstLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstLoginViewModel.kt\ncom/gse/aulapp/viewmodel/FirstLoginViewModel$refreshToken$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,980:1\n1#2:981\n*E\n"})
    /* renamed from: com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshToken$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Context $context;
        final /* synthetic */ FirstLoginViewModel this$0;

        public AnonymousClass2(Context context, FirstLoginViewModel firstLoginViewModel) {
            this.$context = context;
            this.this$0 = firstLoginViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:173:0x0383, code lost:
        
            if (r1.emit(r4, r2) == r3) goto L204;
         */
        /* JADX WARN: Code restructure failed: missing block: B:187:0x03f1, code lost:
        
            if (r1.emit(r5, r2) == r3) goto L204;
         */
        /* JADX WARN: Code restructure failed: missing block: B:198:0x043f, code lost:
        
            if (r1.emit(r4, r2) == r3) goto L204;
         */
        /* JADX WARN: Code restructure failed: missing block: B:200:0x045f, code lost:
        
            if (r1.emit(r4, r2) == r3) goto L204;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ApiResult<RefreshTokenResponse> apiResult, Continuation<? super Unit> continuation) {
            FirstLoginViewModel$refreshToken$1$2$emit$1 firstLoginViewModel$refreshToken$1$2$emit$1;
            int i;
            MutableSharedFlow mutableSharedFlow;
            MutableSharedFlow mutableSharedFlow2;
            MutableSharedFlow mutableSharedFlow3;
            RefreshTokenResponse.Result result;
            MutableSharedFlow mutableSharedFlow4;
            String callSaveTemplate;
            String callSaveTemplate2;
            String str;
            MutableSharedFlow mutableSharedFlow5;
            AnonymousClass2<T> anonymousClass2;
            ApiResult<RefreshTokenResponse> apiResult2;
            RefreshToken data;
            RefreshToken data2;
            RefreshToken data3;
            String docType;
            RefreshToken data4;
            RefreshToken data5;
            RefreshToken data6;
            RefreshToken data7;
            RefreshToken data8;
            RefreshToken data9;
            FourFingersIdenty fourFingersIdentyID;
            FourFingersIdenty fourFingersIdentyID2;
            Boolean biometricException;
            String fullName;
            RefreshToken data10;
            RefreshTokenResponse.Result result2;
            if (continuation instanceof FirstLoginViewModel$refreshToken$1$2$emit$1) {
                firstLoginViewModel$refreshToken$1$2$emit$1 = (FirstLoginViewModel$refreshToken$1$2$emit$1) continuation;
                int i2 = firstLoginViewModel$refreshToken$1$2$emit$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    firstLoginViewModel$refreshToken$1$2$emit$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    Object obj = firstLoginViewModel$refreshToken$1$2$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = firstLoginViewModel$refreshToken$1$2$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (apiResult.getStatus() == EnumApiStatus.SUCCESS) {
                            RefreshTokenResponse data11 = apiResult.getData();
                            if (Intrinsics.areEqual((data11 == null || (result2 = data11.getResult()) == null) ? null : result2.getSuccess(), Boxing.boxBoolean(true))) {
                                RefreshTokenResponse.Result result3 = apiResult.getData().getResult();
                                if ((result3 != null ? result3.getToken() : null) != null) {
                                    RefreshTokenResponse.Result result4 = apiResult.getData().getResult();
                                    String id = (result4 == null || (data10 = result4.getData()) == null) ? null : data10.getId();
                                    RefreshTokenResponse.Result result5 = apiResult.getData().getResult();
                                    String token = result5 != null ? result5.getToken() : null;
                                    Intrinsics.checkNotNull(token);
                                    RefreshTokenResponse.Result result6 = apiResult.getData().getResult();
                                    if (result6 != null) {
                                        result6.getDate();
                                    }
                                    RefreshTokenResponse.Result result7 = apiResult.getData().getResult();
                                    Boolean fullEnrollment = result7 != null ? result7.getFullEnrollment() : null;
                                    RefreshTokenResponse.Result result8 = apiResult.getData().getResult();
                                    if (result8 != null) {
                                        result8.getFraudInformationID();
                                    }
                                    RefreshTokenResponse.Result result9 = apiResult.getData().getResult();
                                    if (result9 != null) {
                                        result9.getBiometrixInformationID();
                                    }
                                    RefreshTokenResponse.Result result10 = apiResult.getData().getResult();
                                    if (result10 != null && (fullName = result10.getFullName()) != null && fullName.length() <= 0) {
                                    }
                                    RefreshTokenResponse.Result result11 = apiResult.getData().getResult();
                                    boolean booleanValue = (result11 == null || (biometricException = result11.getBiometricException()) == null) ? false : biometricException.booleanValue();
                                    RefreshTokenResponse.Result result12 = apiResult.getData().getResult();
                                    Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers = (result12 == null || (fourFingersIdentyID2 = result12.getFourFingersIdentyID()) == null) ? null : FingerToHandConverter.INSTANCE.getHandsAndFingers(fourFingersIdentyID2, EnumHandsAulapp.RIGHT);
                                    RefreshTokenResponse.Result result13 = apiResult.getData().getResult();
                                    Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers2 = (result13 == null || (fourFingersIdentyID = result13.getFourFingersIdentyID()) == null) ? null : FingerToHandConverter.INSTANCE.getHandsAndFingers(fourFingersIdentyID, EnumHandsAulapp.LEFT);
                                    PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
                                    companion.saveToken(this.$context, token);
                                    companion.saveUserId(this.$context, id);
                                    companion.saveBiometricException(this.$context, booleanValue);
                                    Context context = this.$context;
                                    RefreshTokenResponse.Result result14 = apiResult.getData().getResult();
                                    Boolean userDemo = (result14 == null || (data9 = result14.getData()) == null) ? null : data9.getUserDemo();
                                    Intrinsics.checkNotNull(userDemo);
                                    companion.saveUserDemo(context, userDemo.booleanValue());
                                    Context context2 = this.$context;
                                    RefreshTokenResponse.Result result15 = apiResult.getData().getResult();
                                    companion.saveRole(context2, (result15 == null || (data8 = result15.getData()) == null) ? null : data8.getRole());
                                    RefreshTokenResponse.Result result16 = apiResult.getData().getResult();
                                    String email = (result16 == null || (data7 = result16.getData()) == null) ? null : data7.getEmail();
                                    RefreshTokenResponse.Result result17 = apiResult.getData().getResult();
                                    String docNumber = (result17 == null || (data6 = result17.getData()) == null) ? null : data6.getDocNumber();
                                    RefreshTokenResponse.Result result18 = apiResult.getData().getResult();
                                    String fullName2 = (result18 == null || (data5 = result18.getData()) == null) ? null : data5.getFullName();
                                    callSaveTemplate = this.this$0.callSaveTemplate(this.$context, id, handsAndFingers, EnumHandsAulapp.RIGHT);
                                    String str2 = callSaveTemplate == null ? BuildConfig.FLAVOR : callSaveTemplate;
                                    callSaveTemplate2 = this.this$0.callSaveTemplate(this.$context, id, handsAndFingers2, EnumHandsAulapp.LEFT);
                                    String str3 = callSaveTemplate2 == null ? BuildConfig.FLAVOR : callSaveTemplate2;
                                    ProfileUserConverter.Companion companion2 = ProfileUserConverter.INSTANCE;
                                    Context context3 = this.$context;
                                    RefreshTokenResponse.Result result19 = apiResult.getData().getResult();
                                    if (result19 == null || (data4 = result19.getData()) == null || (str = data4.getRole()) == null) {
                                        str = BuildConfig.FLAVOR;
                                    }
                                    EnumUserProfile profileConverter = companion2.getProfileConverter(context3, str);
                                    RefreshTokenResponse.Result result20 = apiResult.getData().getResult();
                                    String str4 = (result20 == null || (data3 = result20.getData()) == null || (docType = data3.getDocType()) == null) ? BuildConfig.FLAVOR : docType;
                                    RefreshTokenResponse.Result result21 = apiResult.getData().getResult();
                                    Boolean userDemo2 = (result21 == null || (data2 = result21.getData()) == null) ? null : data2.getUserDemo();
                                    RefreshTokenResponse.Result result22 = apiResult.getData().getResult();
                                    Boolean biometricException2 = result22 != null ? result22.getBiometricException() : null;
                                    RefreshTokenResponse.Result result23 = apiResult.getData().getResult();
                                    CenterDto center = (result23 == null || (data = result23.getData()) == null) ? null : data.getCenter();
                                    RefreshTokenResponse.Result result24 = apiResult.getData().getResult();
                                    LoginObject loginObject = new LoginObject(token, email, docNumber, fullEnrollment, BuildConfig.FLAVOR, BuildConfig.FLAVOR, id, str2, str3, fullName2, profileConverter, str4, null, center, userDemo2, biometricException2, result24 != null ? result24.getBiometrixInformationID() : null);
                                    mutableSharedFlow5 = this.this$0._messageRefreshToken;
                                    Status.Success success = new Status.Success(loginObject);
                                    firstLoginViewModel$refreshToken$1$2$emit$1.L$0 = this;
                                    firstLoginViewModel$refreshToken$1$2$emit$1.L$1 = apiResult;
                                    firstLoginViewModel$refreshToken$1$2$emit$1.label = 1;
                                    if (mutableSharedFlow5.emit(success, firstLoginViewModel$refreshToken$1$2$emit$1) != coroutine_suspended) {
                                        anonymousClass2 = this;
                                        apiResult2 = apiResult;
                                        LogSendUtil.INSTANCE.setLog(anonymousClass2.$context, "refreshToken success: " + apiResult2.getData().getResult() + ", url: " + apiResult2.getData().getUrl(), null, false);
                                    }
                                } else {
                                    LogSendUtil.Companion companion3 = LogSendUtil.INSTANCE;
                                    Context context4 = this.$context;
                                    RefreshTokenResponse.Result result25 = apiResult.getData().getResult();
                                    RefreshTokenResponse data12 = apiResult.getData();
                                    companion3.setLog(context4, "refreshToken error: " + result25 + ", url: " + (data12 != null ? data12.getUrl() : null), null, false);
                                    mutableSharedFlow4 = this.this$0._messageRefreshToken;
                                    Status.Empty empty = Status.Empty.INSTANCE;
                                    firstLoginViewModel$refreshToken$1$2$emit$1.label = 2;
                                }
                            } else {
                                LogSendUtil.Companion companion4 = LogSendUtil.INSTANCE;
                                Context context5 = this.$context;
                                RefreshTokenResponse data13 = apiResult.getData();
                                RefreshTokenResponse.Result result26 = data13 != null ? data13.getResult() : null;
                                RefreshTokenResponse data14 = apiResult.getData();
                                companion4.setLog(context5, "refreshToken error: " + result26 + ", url: " + (data14 != null ? data14.getUrl() : null), null, false);
                                mutableSharedFlow3 = this.this$0._messageRefreshToken;
                                RefreshTokenResponse data15 = apiResult.getData();
                                if (data15 != null && (result = data15.getResult()) != null) {
                                    r4 = result.getMessage();
                                }
                                Status.Failure failure = new Status.Failure(new Exception(r4));
                                firstLoginViewModel$refreshToken$1$2$emit$1.label = 3;
                            }
                        } else if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                            LogSendUtil.INSTANCE.setLog(this.$context, q.i("refreshToken error: ", apiResult.getMessage()), null, false);
                            Integer statusCode = apiResult.getStatusCode();
                            if (statusCode != null && statusCode.intValue() == 401) {
                                mutableSharedFlow2 = this.this$0._messageRefreshToken;
                                Status.Failure failure2 = new Status.Failure(new Exception("401"));
                                firstLoginViewModel$refreshToken$1$2$emit$1.label = 4;
                            } else {
                                mutableSharedFlow = this.this$0._messageRefreshToken;
                                Status.Failure failure3 = new Status.Failure(new Exception(apiResult.getMessage()));
                                firstLoginViewModel$refreshToken$1$2$emit$1.label = 5;
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    apiResult2 = (ApiResult) firstLoginViewModel$refreshToken$1$2$emit$1.L$1;
                    anonymousClass2 = (AnonymousClass2) firstLoginViewModel$refreshToken$1$2$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    LogSendUtil.INSTANCE.setLog(anonymousClass2.$context, "refreshToken success: " + apiResult2.getData().getResult() + ", url: " + apiResult2.getData().getUrl(), null, false);
                    return Unit.INSTANCE;
                }
            }
            firstLoginViewModel$refreshToken$1$2$emit$1 = new FirstLoginViewModel$refreshToken$1$2$emit$1(this, continuation);
            Object obj2 = firstLoginViewModel$refreshToken$1$2$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = firstLoginViewModel$refreshToken$1$2$emit$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation<? super Unit> continuation) {
            return emit((ApiResult<RefreshTokenResponse>) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
