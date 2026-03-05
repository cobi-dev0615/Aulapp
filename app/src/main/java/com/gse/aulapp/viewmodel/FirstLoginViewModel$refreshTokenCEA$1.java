package com.gse.aulapp.viewmodel;

import android.app.Activity;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.converter.FingerToHandConverter;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.DataCenterDto;
import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumTypeOfIncome;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.repository.ChangeCenterRepository;
import com.gse.aulapp.model.request.ChangeCenterRequest;
import com.gse.aulapp.model.response.ChangeCenterResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.Parameters;
import com.karumi.dexter.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshTokenCEA$1", f = "FirstLoginViewModel.kt", i = {}, l = {621, 651, 790}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFirstLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstLoginViewModel.kt\ncom/gse/aulapp/viewmodel/FirstLoginViewModel$refreshTokenCEA$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,980:1\n1863#2,2:981\n*S KotlinDebug\n*F\n+ 1 FirstLoginViewModel.kt\ncom/gse/aulapp/viewmodel/FirstLoginViewModel$refreshTokenCEA$1\n*L\n626#1:981,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FirstLoginViewModel$refreshTokenCEA$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $ceaSelected;
    final /* synthetic */ List<CenterDto> $centerListCEA;
    final /* synthetic */ String $numberDocument;
    int label;
    final /* synthetic */ FirstLoginViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/ChangeCenterResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshTokenCEA$1$2", f = "FirstLoginViewModel.kt", i = {}, l = {649}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshTokenCEA$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends ChangeCenterResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FirstLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity, FirstLoginViewModel firstLoginViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.$activity = activity;
            this.this$0 = firstLoginViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends ChangeCenterResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<ChangeCenterResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                LogSendUtil.INSTANCE.setLog(this.$activity, q.i("refreshTokenCEA exception: ", th.getMessage()), "refreshTokenCEA", true);
                mutableSharedFlow = this.this$0._messageRefreshTokenCEA;
                Status.Failure failure = new Status.Failure(th);
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
        public final Object invoke2(FlowCollector<? super ApiResult<ChangeCenterResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$activity, this.this$0, continuation);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstLoginViewModel$refreshTokenCEA$1(FirstLoginViewModel firstLoginViewModel, String str, List<CenterDto> list, String str2, Activity activity, Continuation<? super FirstLoginViewModel$refreshTokenCEA$1> continuation) {
        super(2, continuation);
        this.this$0 = firstLoginViewModel;
        this.$ceaSelected = str;
        this.$centerListCEA = list;
        this.$numberDocument = str2;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FirstLoginViewModel$refreshTokenCEA$1(this.this$0, this.$ceaSelected, this.$centerListCEA, this.$numberDocument, this.$activity, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
    
        if (r14.collect(r1, r13) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0039, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, com.gse.aulapp.model.dto.CenterDto] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.gse.aulapp.model.dto.CenterDto] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        ChangeCenterRepository changeCenterRepository;
        boolean equals$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._messageRefreshTokenCEA;
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
        Parameters.INSTANCE.setPARAMETER_TYPE_LOGGIN(EnumTypeOfIncome.REFRESHTOKENCEA);
        String str = this.$ceaSelected;
        if (str != null && str.length() != 0) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new CenterDto(null, null, null, null, 15, null);
            List<CenterDto> list = this.$centerListCEA;
            String str2 = this.$ceaSelected;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ?? r4 = (CenterDto) it.next();
                equals$default = StringsKt__StringsJVMKt.equals$default(r4.getName(), str2, false, 2, null);
                if (equals$default) {
                    objectRef.element = r4;
                }
            }
            if (this.$numberDocument != null) {
                CenterDto centerDto = (CenterDto) objectRef.element;
                ChangeCenterRequest changeCenterRequest = new ChangeCenterRequest(String.valueOf(centerDto != null ? centerDto.getCenterID() : null), this.$numberDocument);
                LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, this.$activity, "refreshTokenCEA request: " + changeCenterRequest, null, false, 12, null);
                changeCenterRepository = this.this$0.changeCenterRepository;
                Flow m1541catch = FlowKt.m1541catch(changeCenterRepository.changeCenter(this.$activity, changeCenterRequest), new AnonymousClass2(this.$activity, this.this$0, null));
                final Activity activity = this.$activity;
                final FirstLoginViewModel firstLoginViewModel = this.this$0;
                final String str3 = this.$numberDocument;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshTokenCEA$1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ApiResult<ChangeCenterResponse>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ApiResult<ChangeCenterResponse> apiResult, Continuation<? super Unit> continuation) {
                        MutableSharedFlow mutableSharedFlow3;
                        ChangeCenterResponse.Result result;
                        MutableSharedFlow mutableSharedFlow4;
                        ChangeCenterResponse.Result result2;
                        ChangeCenterResponse.Result result3;
                        Integer status;
                        boolean validateFinger;
                        boolean validateFinger2;
                        String callSaveTemplate;
                        boolean z;
                        String str4;
                        String callSaveTemplate2;
                        MutableSharedFlow mutableSharedFlow5;
                        DataCenterDto data;
                        DataCenterDto data2;
                        DataCenterDto data3;
                        DataCenterDto data4;
                        DataCenterDto data5;
                        DataCenterDto data6;
                        DataCenterDto data7;
                        DataCenterDto data8;
                        ChangeCenterResponse data9;
                        ChangeCenterResponse.Result result4;
                        DataCenterDto data10;
                        MutableSharedFlow mutableSharedFlow6;
                        ChangeCenterResponse.Result result5;
                        ChangeCenterResponse.Result result6;
                        ChangeCenterResponse data11 = apiResult.getData();
                        String token = (data11 == null || (result6 = data11.getResult()) == null) ? null : result6.getToken();
                        if (token == null || token.length() == 0) {
                            LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                            Activity activity2 = activity;
                            ChangeCenterResponse data12 = apiResult.getData();
                            ChangeCenterResponse.Result result7 = data12 != null ? data12.getResult() : null;
                            ChangeCenterResponse data13 = apiResult.getData();
                            LogSendUtil.Companion.setLog$default(companion, activity2, "refreshTokenCEA Error: token is null " + result7 + ", url: " + (data13 != null ? data13.getUrl() : null), null, false, 12, null);
                            mutableSharedFlow3 = firstLoginViewModel._messageRefreshTokenCEA;
                            ChangeCenterResponse data14 = apiResult.getData();
                            Object emit = mutableSharedFlow3.emit(new Status.Failure(new Exception((data14 == null || (result = data14.getResult()) == null) ? null : result.getMessage())), continuation);
                            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                        }
                        ChangeCenterResponse data15 = apiResult.getData();
                        if (Intrinsics.areEqual((data15 == null || (result5 = data15.getResult()) == null) ? null : Boxing.boxBoolean(result5.getFullEnrollment()), Boxing.boxBoolean(false)) && (data9 = apiResult.getData()) != null && (result4 = data9.getResult()) != null && (data10 = result4.getData()) != null && !data10.getDemoUser()) {
                            mutableSharedFlow6 = firstLoginViewModel._message;
                            Object emit2 = mutableSharedFlow6.emit(new Status.Failure(new Exception("\nUsuario sin enrolamiento")), continuation);
                            return emit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : Unit.INSTANCE;
                        }
                        ChangeCenterResponse data16 = apiResult.getData();
                        if (data16 == null || (result3 = data16.getResult()) == null || (status = result3.getStatus()) == null || status.intValue() != 200) {
                            LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                            Activity activity3 = activity;
                            ChangeCenterResponse data17 = apiResult.getData();
                            ChangeCenterResponse.Result result8 = data17 != null ? data17.getResult() : null;
                            ChangeCenterResponse data18 = apiResult.getData();
                            LogSendUtil.Companion.setLog$default(companion2, activity3, "refreshTokenCEA Error: " + result8 + ", url: " + (data18 != null ? data18.getUrl() : null), null, false, 12, null);
                            mutableSharedFlow4 = firstLoginViewModel._messageRefreshTokenCEA;
                            ChangeCenterResponse data19 = apiResult.getData();
                            Object emit3 = mutableSharedFlow4.emit(new Status.Failure(new Exception((data19 == null || (result2 = data19.getResult()) == null) ? null : result2.getMessage())), continuation);
                            return emit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit3 : Unit.INSTANCE;
                        }
                        ChangeCenterResponse.Result result9 = apiResult.getData().getResult();
                        String token2 = result9 != null ? result9.getToken() : null;
                        Intrinsics.checkNotNull(token2);
                        ChangeCenterResponse.Result result10 = apiResult.getData().getResult();
                        boolean z2 = result10 != null && result10.getFullEnrollment();
                        ChangeCenterResponse.Result result11 = apiResult.getData().getResult();
                        if (result11 != null) {
                            result11.getFullName();
                        }
                        ChangeCenterResponse.Result result12 = apiResult.getData().getResult();
                        FourFingersIdenty fourFingersIdentyID = result12 != null ? result12.getFourFingersIdentyID() : null;
                        FirstLoginViewModel firstLoginViewModel2 = firstLoginViewModel;
                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers = fourFingersIdentyID != null ? FingerToHandConverter.INSTANCE.getHandsAndFingers(fourFingersIdentyID, EnumHandsAulapp.RIGHT) : null;
                        EnumHandsAulapp enumHandsAulapp = EnumHandsAulapp.RIGHT;
                        validateFinger = firstLoginViewModel2.validateFinger(handsAndFingers, enumHandsAulapp);
                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers2 = (!validateFinger || fourFingersIdentyID == null) ? null : FingerToHandConverter.INSTANCE.getHandsAndFingers(fourFingersIdentyID, enumHandsAulapp);
                        FirstLoginViewModel firstLoginViewModel3 = firstLoginViewModel;
                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers3 = fourFingersIdentyID != null ? FingerToHandConverter.INSTANCE.getHandsAndFingers(fourFingersIdentyID, EnumHandsAulapp.LEFT) : null;
                        EnumHandsAulapp enumHandsAulapp2 = EnumHandsAulapp.LEFT;
                        validateFinger2 = firstLoginViewModel3.validateFinger(handsAndFingers3, enumHandsAulapp2);
                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers4 = (!validateFinger2 || fourFingersIdentyID == null) ? null : FingerToHandConverter.INSTANCE.getHandsAndFingers(fourFingersIdentyID, enumHandsAulapp2);
                        ChangeCenterResponse.Result result13 = apiResult.getData().getResult();
                        String userEmail = result13 != null ? result13.getUserEmail() : null;
                        ChangeCenterResponse.Result result14 = apiResult.getData().getResult();
                        String date = result14 != null ? result14.getDate() : null;
                        ChangeCenterResponse.Result result15 = apiResult.getData().getResult();
                        String fraudInformationID = result15 != null ? result15.getFraudInformationID() : null;
                        ChangeCenterResponse.Result result16 = apiResult.getData().getResult();
                        String id = (result16 == null || (data8 = result16.getData()) == null) ? null : data8.getId();
                        FirstLoginViewModel firstLoginViewModel4 = firstLoginViewModel;
                        Activity activity4 = activity;
                        ChangeCenterResponse.Result result17 = apiResult.getData().getResult();
                        callSaveTemplate = firstLoginViewModel4.callSaveTemplate(activity4, (result17 == null || (data7 = result17.getData()) == null) ? null : data7.getId(), handsAndFingers2, enumHandsAulapp);
                        String str5 = BuildConfig.FLAVOR;
                        if (callSaveTemplate == null) {
                            callSaveTemplate = BuildConfig.FLAVOR;
                        }
                        ChangeCenterResponse.Result result18 = apiResult.getData().getResult();
                        String fullName = (result18 == null || (data6 = result18.getData()) == null) ? null : data6.getFullName();
                        FirstLoginViewModel firstLoginViewModel5 = firstLoginViewModel;
                        Activity activity5 = activity;
                        ChangeCenterResponse.Result result19 = apiResult.getData().getResult();
                        if (result19 == null || (data5 = result19.getData()) == null) {
                            z = z2;
                            str4 = null;
                        } else {
                            String id2 = data5.getId();
                            z = z2;
                            str4 = id2;
                        }
                        callSaveTemplate2 = firstLoginViewModel5.callSaveTemplate(activity5, str4, handsAndFingers4, enumHandsAulapp2);
                        if (callSaveTemplate2 != null) {
                            str5 = callSaveTemplate2;
                        }
                        boolean z3 = false;
                        EnumUserProfile enumUserProfile = EnumUserProfile.INSTRUCTOR;
                        ChangeCenterResponse.Result result20 = apiResult.getData().getResult();
                        String docType = (result20 == null || (data4 = result20.getData()) == null) ? null : data4.getDocType();
                        ChangeCenterResponse.Result result21 = apiResult.getData().getResult();
                        List listOf = CollectionsKt.listOf((result21 == null || (data3 = result21.getData()) == null) ? null : data3.getCenter());
                        ChangeCenterResponse.Result result22 = apiResult.getData().getResult();
                        CenterDto center = (result22 == null || (data2 = result22.getData()) == null) ? null : data2.getCenter();
                        ChangeCenterResponse.Result result23 = apiResult.getData().getResult();
                        if (result23 != null && (data = result23.getData()) != null && data.getDemoUser()) {
                            z3 = true;
                        }
                        ChangeCenterResponse.Result result24 = apiResult.getData().getResult();
                        LoginObject loginObject = new LoginObject(token2, userEmail, str3, Boxing.boxBoolean(z), date, fraudInformationID, id, callSaveTemplate, str5, fullName, enumUserProfile, docType, listOf, center, Boxing.boxBoolean(z3), null, result24 != null ? result24.getBiometrixInformationID() : null, 32768, null);
                        LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, activity, "refreshTokenCEA Success: " + apiResult.getData().getResult() + ", url: " + apiResult.getData().getUrl(), null, false, 12, null);
                        mutableSharedFlow5 = firstLoginViewModel._messageRefreshTokenCEA;
                        Object emit4 = mutableSharedFlow5.emit(new Status.Success(loginObject), continuation);
                        return emit4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit4 : Unit.INSTANCE;
                    }
                };
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
        LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, this.$activity, "refreshTokenCEA Error:\nSeleccione un CEA", null, false, 12, null);
        mutableSharedFlow2 = this.this$0._messageRefreshTokenCEA;
        Status.Failure failure = new Status.Failure(new Exception("\nSeleccione un CEA"));
        this.label = 3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FirstLoginViewModel$refreshTokenCEA$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
