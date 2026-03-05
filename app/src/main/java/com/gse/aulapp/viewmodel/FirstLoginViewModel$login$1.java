package com.gse.aulapp.viewmodel;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.R;
import com.gse.aulapp.model.converter.FingerToHandConverter;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.DataLoginDto;
import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumTypeOfIncome;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.repository.LoginRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.LoginRequest;
import com.gse.aulapp.model.response.LoginResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$login$1", f = "FirstLoginViewModel.kt", i = {}, l = {341, 358, 488}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FirstLoginViewModel$login$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ LoginRequest $loginRequest;
    int label;
    final /* synthetic */ FirstLoginViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/LoginResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$login$1$1", f = "FirstLoginViewModel.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.FirstLoginViewModel$login$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends LoginResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FirstLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, FirstLoginViewModel firstLoginViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$context = context;
            this.this$0 = firstLoginViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends LoginResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<LoginResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                LogSendUtil.INSTANCE.setLog(this.$context, "Login Result Exception: " + th, "login", true);
                mutableSharedFlow = this.this$0._message;
                Status.Failure failure = new Status.Failure(new Exception(this.$context.getString(R.string.dialog_text_fail_error_app)));
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
        public final Object invoke2(FlowCollector<? super ApiResult<LoginResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstLoginViewModel$login$1(FirstLoginViewModel firstLoginViewModel, LoginRequest loginRequest, Context context, Continuation<? super FirstLoginViewModel$login$1> continuation) {
        super(2, continuation);
        this.this$0 = firstLoginViewModel;
        this.$loginRequest = loginRequest;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FirstLoginViewModel$login$1(this.this$0, this.$loginRequest, this.$context, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r14.collect(r1, r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        LoginRepository loginRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._message;
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
        Parameters.INSTANCE.setPARAMETER_TYPE_LOGGIN(EnumTypeOfIncome.LOGGIN);
        LoginRequest loginRequest = this.$loginRequest;
        if (loginRequest != null) {
            LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, this.$context, q.i("Login request: ", loginRequest.getUsername()), null, false, 12, null);
            loginRepository = this.this$0.loginRepository;
            Flow m1541catch = FlowKt.m1541catch(loginRepository.login(this.$context, this.$loginRequest), new AnonymousClass1(this.$context, this.this$0, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$context);
            this.label = 2;
        } else {
            LogSendUtil.INSTANCE.setLog(this.$context, "Login Exception: User or pass is null", "login", true);
            mutableSharedFlow2 = this.this$0._message;
            Status.Failure failure = new Status.Failure(new Exception("Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo."));
            this.label = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FirstLoginViewModel$login$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFirstLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstLoginViewModel.kt\ncom/gse/aulapp/viewmodel/FirstLoginViewModel$login$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,980:1\n1863#2,2:981\n*S KotlinDebug\n*F\n+ 1 FirstLoginViewModel.kt\ncom/gse/aulapp/viewmodel/FirstLoginViewModel$login$1$2\n*L\n410#1:981,2\n*E\n"})
    /* renamed from: com.gse.aulapp.viewmodel.FirstLoginViewModel$login$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Context $context;
        final /* synthetic */ FirstLoginViewModel this$0;

        public AnonymousClass2(FirstLoginViewModel firstLoginViewModel, Context context) {
            this.this$0 = firstLoginViewModel;
            this.$context = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:180:0x03f4, code lost:
        
            if (r1.emit(r5, r2) == r3) goto L220;
         */
        /* JADX WARN: Code restructure failed: missing block: B:209:0x0480, code lost:
        
            if (r1.emit(r5, r2) == r3) goto L220;
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x04b1, code lost:
        
            if (r1.emit(r5, r2) == r3) goto L220;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
        
            if (r1.emit(r4, r2) == r3) goto L220;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0385  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Type inference failed for: r7v18, types: [T, com.gse.aulapp.model.dto.CenterDto] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ApiResult<LoginResponse> apiResult, Continuation<? super Unit> continuation) {
            FirstLoginViewModel$login$1$2$emit$1 firstLoginViewModel$login$1$2$emit$1;
            MutableSharedFlow mutableSharedFlow;
            LoginResponse.Result result;
            MutableSharedFlow mutableSharedFlow2;
            String str;
            LoginResponse.Result result2;
            SessionRepository sessionRepository;
            ApiResult<LoginResponse> apiResult2;
            AnonymousClass2<T> anonymousClass2;
            LoginResponse data;
            MutableSharedFlow mutableSharedFlow3;
            LoginResponse.Result result3;
            String callSaveTemplate;
            String callSaveTemplate2;
            MutableSharedFlow mutableSharedFlow4;
            ApiResult<LoginResponse> apiResult3;
            AnonymousClass2<T> anonymousClass22;
            DataLoginDto data2;
            DataLoginDto data3;
            DataLoginDto data4;
            boolean equals$default;
            DataLoginDto data5;
            DataLoginDto data6;
            Boolean biometricException;
            LoginResponse.Result result4;
            DataLoginDto data7;
            MutableSharedFlow mutableSharedFlow5;
            LoginResponse.Result result5;
            if (continuation instanceof FirstLoginViewModel$login$1$2$emit$1) {
                firstLoginViewModel$login$1$2$emit$1 = (FirstLoginViewModel$login$1$2$emit$1) continuation;
                int i = firstLoginViewModel$login$1$2$emit$1.label;
                if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                    firstLoginViewModel$login$1$2$emit$1.label = i - IntCompanionObject.MIN_VALUE;
                    Object obj = firstLoginViewModel$login$1$2$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (firstLoginViewModel$login$1$2$emit$1.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            if (apiResult.getStatus() != EnumApiStatus.SUCCESS) {
                                if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                                    LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                                    Context context = this.$context;
                                    LoginResponse data8 = apiResult.getData();
                                    LoginResponse.Result result6 = data8 != null ? data8.getResult() : null;
                                    LoginResponse data9 = apiResult.getData();
                                    LogSendUtil.Companion.setLog$default(companion, context, "Login Error:  " + result6 + ",  url: " + (data9 != null ? data9.getUrl() : null), null, false, 12, null);
                                    Integer statusCode = apiResult.getStatusCode();
                                    if (statusCode == null || statusCode.intValue() != 401) {
                                        mutableSharedFlow = this.this$0._message;
                                        LoginResponse data10 = apiResult.getData();
                                        Status.Failure failure = new Status.Failure(new Exception((data10 == null || (result = data10.getResult()) == null) ? null : result.getMessage()));
                                        firstLoginViewModel$login$1$2$emit$1.label = 6;
                                        break;
                                    } else {
                                        mutableSharedFlow2 = this.this$0._message;
                                        LoginResponse data11 = apiResult.getData();
                                        if (data11 == null || (result2 = data11.getResult()) == null || (str = result2.getMessage()) == null) {
                                            str = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
                                        }
                                        Status.Failure failure2 = new Status.Failure(new Exception(str));
                                        firstLoginViewModel$login$1$2$emit$1.label = 5;
                                        break;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            sessionRepository = this.this$0.sessionRepository;
                            firstLoginViewModel$login$1$2$emit$1.L$0 = this;
                            apiResult2 = apiResult;
                            firstLoginViewModel$login$1$2$emit$1.L$1 = apiResult2;
                            firstLoginViewModel$login$1$2$emit$1.label = 1;
                            if (sessionRepository.deleteLogOutSession(firstLoginViewModel$login$1$2$emit$1) != coroutine_suspended) {
                                anonymousClass2 = this;
                                data = apiResult2.getData();
                                if (((data != null || (result5 = data.getResult()) == null) ? null : result5.getToken()) != null) {
                                    LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                                    Context context2 = anonymousClass2.$context;
                                    LoginResponse data12 = apiResult2.getData();
                                    LoginResponse.Result result7 = data12 != null ? data12.getResult() : null;
                                    LoginResponse data13 = apiResult2.getData();
                                    LogSendUtil.Companion.setLog$default(companion2, context2, "Login: Token is null error: " + result7 + ", url: " + (data13 != null ? data13.getUrl() : null), null, false, 12, null);
                                    mutableSharedFlow3 = anonymousClass2.this$0._message;
                                    LoginResponse data14 = apiResult2.getData();
                                    Status.Failure failure3 = new Status.Failure(new Exception((data14 == null || (result3 = data14.getResult()) == null) ? null : result3.getMessage()));
                                    firstLoginViewModel$login$1$2$emit$1.L$0 = null;
                                    firstLoginViewModel$login$1$2$emit$1.L$1 = null;
                                    firstLoginViewModel$login$1$2$emit$1.label = 4;
                                    break;
                                } else {
                                    LoginResponse.Result result8 = apiResult2.getData().getResult();
                                    Boolean fullEnrollment = result8 != null ? result8.getFullEnrollment() : null;
                                    if (Intrinsics.areEqual(fullEnrollment, Boxing.boxBoolean(false)) && (result4 = apiResult2.getData().getResult()) != null && (data7 = result4.getData()) != null && !data7.getDemoUser()) {
                                        mutableSharedFlow5 = anonymousClass2.this$0._message;
                                        Status.Failure failure4 = new Status.Failure(new Exception("\nUsuario sin enrolamiento"));
                                        firstLoginViewModel$login$1$2$emit$1.L$0 = null;
                                        firstLoginViewModel$login$1$2$emit$1.L$1 = null;
                                        firstLoginViewModel$login$1$2$emit$1.label = 2;
                                        break;
                                    } else {
                                        LoginResponse.Result result9 = apiResult2.getData().getResult();
                                        String token = result9 != null ? result9.getToken() : null;
                                        Intrinsics.checkNotNull(token);
                                        LoginResponse.Result result10 = apiResult2.getData().getResult();
                                        if (result10 != null) {
                                            result10.getUserEmail();
                                        }
                                        LoginResponse.Result result11 = apiResult2.getData().getResult();
                                        if (result11 != null) {
                                            result11.getDocumentNumber();
                                        }
                                        LoginResponse.Result result12 = apiResult2.getData().getResult();
                                        if (result12 != null) {
                                            result12.getDate();
                                        }
                                        LoginResponse.Result result13 = apiResult2.getData().getResult();
                                        if (result13 != null) {
                                            result13.getFraudInformationID();
                                        }
                                        LoginResponse.Result result14 = apiResult2.getData().getResult();
                                        if (result14 != null) {
                                            result14.getBiometrixInformationID();
                                        }
                                        LoginResponse.Result result15 = apiResult2.getData().getResult();
                                        FourFingersIdenty fourFingersIdentyID = result15 != null ? result15.getFourFingersIdentyID() : null;
                                        LoginResponse.Result result16 = apiResult2.getData().getResult();
                                        String userID = result16 != null ? result16.getUserID() : null;
                                        LoginResponse.Result result17 = apiResult2.getData().getResult();
                                        boolean booleanValue = (result17 == null || (data6 = result17.getData()) == null || (biometricException = data6.getBiometricException()) == null) ? false : biometricException.booleanValue();
                                        PreferenceUtil.Companion companion3 = PreferenceUtil.INSTANCE;
                                        companion3.saveToken(anonymousClass2.$context, token);
                                        companion3.saveUserId(anonymousClass2.$context, userID);
                                        Context context3 = anonymousClass2.$context;
                                        LoginResponse.Result result18 = apiResult2.getData().getResult();
                                        companion3.saveUserDemo(context3, (result18 == null || (data5 = result18.getData()) == null || !data5.getDemoUser()) ? false : true);
                                        companion3.saveBiometricException(anonymousClass2.$context, booleanValue);
                                        FingerToHandConverter.Companion companion4 = FingerToHandConverter.INSTANCE;
                                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers = companion4.getHandsAndFingers(fourFingersIdentyID, EnumHandsAulapp.RIGHT);
                                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers2 = companion4.getHandsAndFingers(fourFingersIdentyID, EnumHandsAulapp.LEFT);
                                        LoginResponse.Result result19 = apiResult2.getData().getResult();
                                        String centerID = result19 != null ? result19.getCenterID() : null;
                                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                        LoginResponse.Result result20 = apiResult2.getData().getResult();
                                        List<CenterDto> centerList = result20 != null ? result20.getCenterList() : null;
                                        if (centerList != null) {
                                            Iterator<T> it = centerList.iterator();
                                            while (it.hasNext()) {
                                                CenterDto r7 = (CenterDto) it.next();
                                                equals$default = StringsKt.equals$default(r7.getCenterID(), centerID, false, 2, null);
                                                if (equals$default) {
                                                    objectRef.element = r7;
                                                }
                                            }
                                        }
                                        LoginResponse.Result result21 = apiResult2.getData().getResult();
                                        String userEmail = result21 != null ? result21.getUserEmail() : null;
                                        LoginResponse.Result result22 = apiResult2.getData().getResult();
                                        String documentNumber = result22 != null ? result22.getDocumentNumber() : null;
                                        LoginResponse.Result result23 = apiResult2.getData().getResult();
                                        String date = result23 != null ? result23.getDate() : null;
                                        LoginResponse.Result result24 = apiResult2.getData().getResult();
                                        String fraudInformationID = result24 != null ? result24.getFraudInformationID() : null;
                                        String str2 = userEmail;
                                        String str3 = documentNumber;
                                        String str4 = date;
                                        callSaveTemplate = anonymousClass2.this$0.callSaveTemplate(anonymousClass2.$context, userID, handsAndFingers, EnumHandsAulapp.RIGHT);
                                        if (callSaveTemplate == null) {
                                            callSaveTemplate = BuildConfig.FLAVOR;
                                        }
                                        LoginResponse.Result result25 = apiResult2.getData().getResult();
                                        String fullName = (result25 == null || (data4 = result25.getData()) == null) ? null : data4.getFullName();
                                        String str5 = callSaveTemplate;
                                        callSaveTemplate2 = anonymousClass2.this$0.callSaveTemplate(anonymousClass2.$context, userID, handsAndFingers2, EnumHandsAulapp.LEFT);
                                        String str6 = callSaveTemplate2 == null ? BuildConfig.FLAVOR : callSaveTemplate2;
                                        String str7 = userID;
                                        EnumUserProfile enumUserProfile = EnumUserProfile.INSTRUCTOR;
                                        LoginResponse.Result result26 = apiResult2.getData().getResult();
                                        String docType = (result26 == null || (data3 = result26.getData()) == null) ? null : data3.getDocType();
                                        LoginResponse.Result result27 = apiResult2.getData().getResult();
                                        List<CenterDto> centerList2 = result27 != null ? result27.getCenterList() : null;
                                        CenterDto centerDto = (CenterDto) objectRef.element;
                                        LoginResponse.Result result28 = apiResult2.getData().getResult();
                                        boolean z = (result28 == null || (data2 = result28.getData()) == null || !data2.getDemoUser()) ? false : true;
                                        LoginResponse.Result result29 = apiResult2.getData().getResult();
                                        LoginObject loginObject = new LoginObject(token, str2, str3, fullEnrollment, str4, fraudInformationID, str7, str5, str6, fullName, enumUserProfile, docType, centerList2, centerDto, Boxing.boxBoolean(z), null, result29 != null ? result29.getBiometrixInformationID() : null, 32768, null);
                                        mutableSharedFlow4 = anonymousClass2.this$0._message;
                                        Status.Success success = new Status.Success(loginObject);
                                        firstLoginViewModel$login$1$2$emit$1.L$0 = anonymousClass2;
                                        firstLoginViewModel$login$1$2$emit$1.L$1 = apiResult2;
                                        firstLoginViewModel$login$1$2$emit$1.label = 3;
                                        if (mutableSharedFlow4.emit(success, firstLoginViewModel$login$1$2$emit$1) != coroutine_suspended) {
                                            apiResult3 = apiResult2;
                                            anonymousClass22 = anonymousClass2;
                                            LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, anonymousClass22.$context, "Login Result Success:  " + apiResult3.getData().getResult() + ", url: " + apiResult3.getData().getUrl(), null, false, 12, null);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            apiResult2 = (ApiResult) firstLoginViewModel$login$1$2$emit$1.L$1;
                            anonymousClass2 = (AnonymousClass2) firstLoginViewModel$login$1$2$emit$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            data = apiResult2.getData();
                            if (data != null) {
                                break;
                            }
                            if (((data != null || (result5 = data.getResult()) == null) ? null : result5.getToken()) != null) {
                            }
                            return coroutine_suspended;
                        case 2:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 3:
                            apiResult3 = (ApiResult) firstLoginViewModel$login$1$2$emit$1.L$1;
                            anonymousClass22 = (AnonymousClass2) firstLoginViewModel$login$1$2$emit$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, anonymousClass22.$context, "Login Result Success:  " + apiResult3.getData().getResult() + ", url: " + apiResult3.getData().getUrl(), null, false, 12, null);
                            return Unit.INSTANCE;
                        case 4:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 5:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 6:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            firstLoginViewModel$login$1$2$emit$1 = new FirstLoginViewModel$login$1$2$emit$1(this, continuation);
            Object obj2 = firstLoginViewModel$login$1$2$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (firstLoginViewModel$login$1$2$emit$1.label) {
            }
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((ApiResult<LoginResponse>) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
