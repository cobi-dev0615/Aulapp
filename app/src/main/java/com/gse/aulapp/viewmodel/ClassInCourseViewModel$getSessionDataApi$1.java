package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import co.ceduladigital.sdk.c1;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.SessionExamRequest;
import com.gse.aulapp.model.response.SessionExamDataResponse;
import com.gse.aulapp.model.response.SessionExamResponse;
import com.gse.aulapp.model.response.TestDataResponse;
import com.gse.aulapp.model.response.TestResponse;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$getSessionDataApi$1", f = "ClassInCourseViewModel.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$getSessionDataApi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NavController $findNavController;
    final /* synthetic */ String $sessionID;
    final /* synthetic */ boolean $startChronometer;
    int label;
    final /* synthetic */ ClassInCourseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$getSessionDataApi$1(Context context, String str, ClassInCourseViewModel classInCourseViewModel, boolean z, NavController navController, Continuation<? super ClassInCourseViewModel$getSessionDataApi$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$sessionID = str;
        this.this$0 = classInCourseViewModel;
        this.$startChronometer = z;
        this.$findNavController = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassInCourseViewModel$getSessionDataApi$1(this.$context, this.$sessionID, this.this$0, this.$startChronometer, this.$findNavController, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("getSessionDataApi request: ", this.$sessionID), null, false);
            sessionRepository = this.this$0.sessionRepository;
            Flow<ApiResult<SessionExamResponse>> sessionDataApi = sessionRepository.getSessionDataApi(this.$context, new SessionExamRequest(this.$sessionID));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, this.$sessionID, this.$startChronometer, this.$findNavController);
            this.label = 1;
            if (sessionDataApi.collect(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassInCourseViewModel$getSessionDataApi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.gse.aulapp.viewmodel.ClassInCourseViewModel$getSessionDataApi$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ Context $context;
        final /* synthetic */ NavController $findNavController;
        final /* synthetic */ String $sessionID;
        final /* synthetic */ boolean $startChronometer;
        final /* synthetic */ ClassInCourseViewModel this$0;

        public AnonymousClass1(Context context, ClassInCourseViewModel classInCourseViewModel, String str, boolean z, NavController navController) {
            this.$context = context;
            this.this$0 = classInCourseViewModel;
            this.$sessionID = str;
            this.$startChronometer = z;
            this.$findNavController = navController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$0(ClassInCourseViewModel this$0, Context context, NavController findNavController, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
            SessionDto sessionReceived = this$0.getSessionReceived();
            Intrinsics.checkNotNull(sessionReceived);
            String sessionID = sessionReceived.getId();
            EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            this$0.navigationTo(context, findNavController, new c1(sessionID, true, sessionType));
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0162, code lost:
        
            if (r1 == r3) goto L70;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ApiResult<SessionExamResponse> apiResult, Continuation<? super Unit> continuation) {
            ClassInCourseViewModel$getSessionDataApi$1$1$emit$1 classInCourseViewModel$getSessionDataApi$1$1$emit$1;
            int i;
            List questions;
            Object saveTestInDB;
            AnonymousClass1<T> anonymousClass1;
            TestResponse testResponse;
            SessionExamResponse.Result result;
            SessionExamDataResponse data;
            TestDataResponse testData;
            Object saveQuestionInDB;
            AnonymousClass1<T> anonymousClass12;
            Object loadQuestionsFromDB;
            if (continuation instanceof ClassInCourseViewModel$getSessionDataApi$1$1$emit$1) {
                classInCourseViewModel$getSessionDataApi$1$1$emit$1 = (ClassInCourseViewModel$getSessionDataApi$1$1$emit$1) continuation;
                int i2 = classInCourseViewModel$getSessionDataApi$1$1$emit$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    classInCourseViewModel$getSessionDataApi$1$1$emit$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    ClassInCourseViewModel$getSessionDataApi$1$1$emit$1 classInCourseViewModel$getSessionDataApi$1$1$emit$12 = classInCourseViewModel$getSessionDataApi$1$1$emit$1;
                    Object obj = classInCourseViewModel$getSessionDataApi$1$1$emit$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = classInCourseViewModel$getSessionDataApi$1$1$emit$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (apiResult instanceof ApiResult.Failure) {
                            LogSendUtil.INSTANCE.setLog(this.$context, "getSessionDataApi error: " + apiResult, null, false);
                        } else if (apiResult instanceof ApiResult.Success) {
                            ApiResult.Success success = (ApiResult.Success) apiResult;
                            SessionExamResponse sessionExamResponse = (SessionExamResponse) success.getData();
                            TestResponse test = (sessionExamResponse == null || (result = sessionExamResponse.getResult()) == null || (data = result.getData()) == null || (testData = data.getTestData()) == null) ? null : testData.getTest();
                            questions = test != null ? test.getQuestions() : null;
                            if (questions != null && !questions.isEmpty()) {
                                LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                                Context context = this.$context;
                                SessionExamResponse sessionExamResponse2 = (SessionExamResponse) success.getData();
                                SessionExamResponse.Result result2 = sessionExamResponse2 != null ? sessionExamResponse2.getResult() : null;
                                SessionExamResponse sessionExamResponse3 = (SessionExamResponse) success.getData();
                                companion.setLog(context, "getSessionDataApi Success: " + result2 + ", url: " + (sessionExamResponse3 != null ? sessionExamResponse3.getUrl() : null), null, false);
                                ClassInCourseViewModel classInCourseViewModel = this.this$0;
                                String testID = test != null ? test.getTestID() : null;
                                Intrinsics.checkNotNull(testID);
                                String str = this.$sessionID;
                                classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$0 = this;
                                classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$1 = test;
                                classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$2 = questions;
                                classInCourseViewModel$getSessionDataApi$1$1$emit$12.label = 1;
                                saveTestInDB = classInCourseViewModel.saveTestInDB(testID, str, classInCourseViewModel$getSessionDataApi$1$1$emit$12);
                                if (saveTestInDB != coroutine_suspended) {
                                    anonymousClass1 = this;
                                    testResponse = test;
                                }
                                return coroutine_suspended;
                            }
                            DialogUtil.Companion companion2 = DialogUtil.INSTANCE;
                            Context context2 = this.$context;
                            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                            DialogUtil.Companion.showErrorDialog$default(companion2, (Activity) context2, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, null, false, new a(this.this$0, this.$context, this.$findNavController, 0), 28, null);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 1) {
                        ArrayList arrayList = (ArrayList) classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$2;
                        TestResponse testResponse2 = (TestResponse) classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$1;
                        anonymousClass1 = (AnonymousClass1) classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        questions = arrayList;
                        testResponse = testResponse2;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        testResponse = (TestResponse) classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$1;
                        anonymousClass12 = (AnonymousClass1) classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = anonymousClass12;
                        ClassInCourseViewModel classInCourseViewModel2 = anonymousClass1.this$0;
                        Context context3 = anonymousClass1.$context;
                        String str2 = anonymousClass1.$sessionID;
                        String testID2 = testResponse.getTestID();
                        Intrinsics.checkNotNull(testID2);
                        NavController navController = anonymousClass1.$findNavController;
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$0 = null;
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$1 = null;
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$2 = null;
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.label = 3;
                        loadQuestionsFromDB = classInCourseViewModel2.loadQuestionsFromDB(context3, str2, testID2, navController, classInCourseViewModel$getSessionDataApi$1$1$emit$12);
                    }
                    if (!anonymousClass1.$startChronometer) {
                        ClassInCourseViewModel classInCourseViewModel3 = anonymousClass1.this$0;
                        String testID3 = testResponse.getTestID();
                        Intrinsics.checkNotNull(testID3);
                        if (questions == null) {
                            questions = CollectionsKt.emptyList();
                        }
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$0 = anonymousClass1;
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$1 = testResponse;
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$2 = null;
                        classInCourseViewModel$getSessionDataApi$1$1$emit$12.label = 2;
                        saveQuestionInDB = classInCourseViewModel3.saveQuestionInDB(testID3, questions, classInCourseViewModel$getSessionDataApi$1$1$emit$12);
                        if (saveQuestionInDB != coroutine_suspended) {
                            anonymousClass12 = anonymousClass1;
                            anonymousClass1 = anonymousClass12;
                        }
                        return coroutine_suspended;
                    }
                    ClassInCourseViewModel classInCourseViewModel22 = anonymousClass1.this$0;
                    Context context32 = anonymousClass1.$context;
                    String str22 = anonymousClass1.$sessionID;
                    String testID22 = testResponse.getTestID();
                    Intrinsics.checkNotNull(testID22);
                    NavController navController2 = anonymousClass1.$findNavController;
                    classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$0 = null;
                    classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$1 = null;
                    classInCourseViewModel$getSessionDataApi$1$1$emit$12.L$2 = null;
                    classInCourseViewModel$getSessionDataApi$1$1$emit$12.label = 3;
                    loadQuestionsFromDB = classInCourseViewModel22.loadQuestionsFromDB(context32, str22, testID22, navController2, classInCourseViewModel$getSessionDataApi$1$1$emit$12);
                }
            }
            classInCourseViewModel$getSessionDataApi$1$1$emit$1 = new ClassInCourseViewModel$getSessionDataApi$1$1$emit$1(this, continuation);
            ClassInCourseViewModel$getSessionDataApi$1$1$emit$1 classInCourseViewModel$getSessionDataApi$1$1$emit$122 = classInCourseViewModel$getSessionDataApi$1$1$emit$1;
            Object obj2 = classInCourseViewModel$getSessionDataApi$1$1$emit$122.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = classInCourseViewModel$getSessionDataApi$1$1$emit$122.label;
            if (i != 0) {
            }
            if (!anonymousClass1.$startChronometer) {
            }
            ClassInCourseViewModel classInCourseViewModel222 = anonymousClass1.this$0;
            Context context322 = anonymousClass1.$context;
            String str222 = anonymousClass1.$sessionID;
            String testID222 = testResponse.getTestID();
            Intrinsics.checkNotNull(testID222);
            NavController navController22 = anonymousClass1.$findNavController;
            classInCourseViewModel$getSessionDataApi$1$1$emit$122.L$0 = null;
            classInCourseViewModel$getSessionDataApi$1$1$emit$122.L$1 = null;
            classInCourseViewModel$getSessionDataApi$1$1$emit$122.L$2 = null;
            classInCourseViewModel$getSessionDataApi$1$1$emit$122.label = 3;
            loadQuestionsFromDB = classInCourseViewModel222.loadQuestionsFromDB(context322, str222, testID222, navController22, classInCourseViewModel$getSessionDataApi$1$1$emit$122);
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((ApiResult<SessionExamResponse>) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
