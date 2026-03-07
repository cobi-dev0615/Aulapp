package com.gse.aulapp.viewmodel;

import android.content.Context;
import android.util.Log;
import androidx.navigation.NavController;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.SummaryExamUtil;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$sendPracticeExamSync$1", f = "ClassInCourseViewModel.kt", i = {}, l = {1013, 1027}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$sendPracticeExamSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NavController $findNavController;
    final /* synthetic */ String $sessionID;
    int label;
    final /* synthetic */ ClassInCourseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$sendPracticeExamSync$1(Context context, ClassInCourseViewModel classInCourseViewModel, String str, NavController navController, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.this$0 = classInCourseViewModel;
        this.$sessionID = str;
        this.$findNavController = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ClassInCourseViewModel$sendPracticeExamSync$1(this.$context, this.this$0, this.$sessionID, this.$findNavController, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (r11.collect(r0, r10) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r11.updateDateEndClass(r5, r4, r10) == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        SessionRepository sessionRepository2;
        String unused;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("sendPracticeExamSync exception ", e.getMessage()), null, false);
            unused = this.this$0.TAG;
            e.getMessage();
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Long dateLong = DateUtil.INSTANCE.getDateLong();
            if (dateLong != null) {
                ClassInCourseViewModel classInCourseViewModel = this.this$0;
                String str = this.$sessionID;
                long longValue = dateLong.longValue();
                sessionRepository2 = classInCourseViewModel.sessionRepository;
                this.label = 1;
            }
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("sendPracticeExamSync request ", this.$sessionID), null, false);
            sessionRepository = this.this$0.sessionRepository;
            Flow<ApiResult<SessionPracticeExamResponse>> sendSessionPracticeAndSyncPracticalRequest2 = sessionRepository.sendSessionPracticeAndSyncPracticalRequest2(this.$context, this.$sessionID);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$sessionID, this.$context, this.$findNavController);
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        LogSendUtil.INSTANCE.setLog(this.$context, q.i("sendPracticeExamSync request ", this.$sessionID), null, false);
        sessionRepository = this.this$0.sessionRepository;
        Flow<ApiResult<SessionPracticeExamResponse>> sendSessionPracticeAndSyncPracticalRequest22 = sessionRepository.sendSessionPracticeAndSyncPracticalRequest2(this.$context, this.$sessionID);
        AnonymousClass2 anonymousClass22 = new AnonymousClass2(this.this$0, this.$sessionID, this.$context, this.$findNavController);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassInCourseViewModel$sendPracticeExamSync$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.gse.aulapp.viewmodel.ClassInCourseViewModel$sendPracticeExamSync$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Context $context;
        final /* synthetic */ NavController $findNavController;
        final /* synthetic */ String $sessionID;
        final /* synthetic */ ClassInCourseViewModel this$0;

        public AnonymousClass2(ClassInCourseViewModel classInCourseViewModel, String str, Context context, NavController navController) {
            this.this$0 = classInCourseViewModel;
            this.$sessionID = str;
            this.$context = context;
            this.$findNavController = navController;
        }

        /* JADX WARN: Code restructure failed: missing block: B:98:0x0245, code lost:
        
            if (r0.updateIsPending("1", r5, r2) == r3) goto L108;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ApiResult<SessionPracticeExamResponse> apiResult, Continuation continuation) {
            ClassInCourseViewModel$sendPracticeExamSync$1$2$emit$1 classInCourseViewModel$sendPracticeExamSync$1$2$emit$1;
            int i;
            SessionRepository sessionRepository;
            ApiResult<SessionPracticeExamResponse> apiResult2;
            AnonymousClass2<T> anonymousClass2;
            AnonymousClass2<T> anonymousClass22;
            SessionRepository sessionRepository2;
            SessionPracticeExamResponse data;
            SessionPracticeExamResponse data2;
            ApiResult<SessionPracticeExamResponse> apiResult3;
            AnonymousClass2<T> anonymousClass23;
            int i2;
            int i3;
            SessionRepository sessionRepository3;
            String str;
            SessionPracticeExamResponse data3;
            SessionPracticeExamResponse data4;
            String examResult;
            int hashCode;
            SessionPracticeExamResponse.Result result;
            String str2;
            String unused;
            if (continuation instanceof ClassInCourseViewModel$sendPracticeExamSync$1$2$emit$1) {
                classInCourseViewModel$sendPracticeExamSync$1$2$emit$1 = (ClassInCourseViewModel$sendPracticeExamSync$1$2$emit$1) continuation;
                int i4 = classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.label;
                if ((i4 & IntCompanionObject.MIN_VALUE) != 0) {
                    classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.label = i4 - IntCompanionObject.MIN_VALUE;
                    Object obj = classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        sessionRepository = this.this$0.sessionRepository;
                        String str3 = this.$sessionID;
                        classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$0 = this;
                        classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$1 = apiResult;
                        classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.label = 1;
                        obj = sessionRepository.getAllQuestionSync(str3, classInCourseViewModel$sendPracticeExamSync$1$2$emit$1);
                        if (obj != coroutine_suspended) {
                            apiResult2 = apiResult;
                            anonymousClass2 = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            anonymousClass22 = (AnonymousClass2) classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Exception e) {
                                e = e;
                                str2 = anonymousClass22.this$0.TAG;
                                Boxing.boxInt(Log.e(str2, "Exception updateIsPending " + e.getMessage()));
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                        i3 = classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.I$1;
                        i2 = classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.I$0;
                        apiResult3 = (ApiResult) classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$1;
                        anonymousClass23 = (AnonymousClass2) classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e2) {
                            e = e2;
                            LogSendUtil.INSTANCE.setLog(anonymousClass23.$context, q.i("sendPracticeExamSync exception ", e.getMessage()), "sendPracticeExamSync", true);
                            unused = anonymousClass23.this$0.TAG;
                            e.getMessage();
                            int i5 = i3;
                            int i6 = i2;
                            SessionPracticeExamResponse data5 = apiResult3.getData();
                            if (data5 != null) {
                            }
                            if (examResult != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        int i52 = i3;
                        int i62 = i2;
                        SessionPracticeExamResponse data52 = apiResult3.getData();
                        examResult = (data52 != null || (result = data52.getResult()) == null) ? null : result.getExamResult();
                        if (examResult != null && examResult.length() != 0 && examResult != null) {
                            hashCode = examResult.hashCode();
                            if (hashCode == -1779119228) {
                                if (hashCode != 1510488259) {
                                    if (hashCode == 2021951926 && examResult.equals("APROBADO")) {
                                        anonymousClass23.this$0.showDialogPassExam(anonymousClass23.$context, true, i62, i52, anonymousClass23.$sessionID, anonymousClass23.$findNavController);
                                    }
                                } else if (examResult.equals("PENDIENTE POR FINALIZAR")) {
                                    anonymousClass23.this$0.showPendingFinish(anonymousClass23.$context, anonymousClass23.$sessionID, anonymousClass23.$findNavController);
                                }
                            } else if (examResult.equals("REPROBADO")) {
                                anonymousClass23.this$0.showDialogPassExam(anonymousClass23.$context, false, i62, i52, anonymousClass23.$sessionID, anonymousClass23.$findNavController);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    apiResult2 = (ApiResult) classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$1;
                    anonymousClass2 = (AnonymousClass2) classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Pair<Integer, Integer> validateQuestionsStatus = SummaryExamUtil.INSTANCE.validateQuestionsStatus((List) obj);
                    int intValue = validateQuestionsStatus.component1().intValue();
                    int intValue2 = validateQuestionsStatus.component2().intValue();
                    LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                    companion.setLog(anonymousClass2.$context, "sendPracticeExamSync result " + ((apiResult2 != null || (data4 = apiResult2.getData()) == null) ? null : data4.getResult()) + ", url: " + ((apiResult2 != null || (data3 = apiResult2.getData()) == null) ? null : data3.getUrl()), null, false);
                    if ((apiResult2 == null ? apiResult2.getStatus() : null) != EnumApiStatus.SUCCESS) {
                        Context context = anonymousClass2.$context;
                        SessionPracticeExamResponse data6 = apiResult2.getData();
                        SessionPracticeExamResponse.Result result2 = data6 != null ? data6.getResult() : null;
                        SessionPracticeExamResponse data7 = apiResult2.getData();
                        companion.setLog(context, "sendPracticeExamSync success " + result2 + ", url: " + (data7 != null ? data7.getUrl() : null), null, false);
                        try {
                            sessionRepository3 = anonymousClass2.this$0.sessionRepository;
                            str = anonymousClass2.$sessionID;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$0 = anonymousClass2;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$1 = apiResult2;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.I$0 = intValue;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.I$1 = intValue2;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.label = 2;
                        } catch (Exception e3) {
                            e = e3;
                            apiResult3 = apiResult2;
                            anonymousClass23 = anonymousClass2;
                            i2 = intValue;
                            i3 = intValue2;
                            LogSendUtil.INSTANCE.setLog(anonymousClass23.$context, q.i("sendPracticeExamSync exception ", e.getMessage()), "sendPracticeExamSync", true);
                            unused = anonymousClass23.this$0.TAG;
                            e.getMessage();
                            int i522 = i3;
                            int i622 = i2;
                            SessionPracticeExamResponse data522 = apiResult3.getData();
                            if (data522 != null) {
                            }
                            if (examResult != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (sessionRepository3.updateIsPending("0", str, classInCourseViewModel$sendPracticeExamSync$1$2$emit$1) != coroutine_suspended) {
                            apiResult3 = apiResult2;
                            anonymousClass23 = anonymousClass2;
                            i2 = intValue;
                            i3 = intValue2;
                            int i5222 = i3;
                            int i6222 = i2;
                            SessionPracticeExamResponse data5222 = apiResult3.getData();
                            if (data5222 != null) {
                            }
                            if (examResult != null) {
                                hashCode = examResult.hashCode();
                                if (hashCode == -1779119228) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        companion.setLog(anonymousClass2.$context, "sendPracticeExamSync error " + ((apiResult2 == null || (data2 = apiResult2.getData()) == null) ? null : data2.getResult()) + ", url: " + ((apiResult2 == null || (data = apiResult2.getData()) == null) ? null : data.getUrl()), null, false);
                        anonymousClass2.this$0.failConnection(anonymousClass2.$context);
                        try {
                            sessionRepository2 = anonymousClass2.this$0.sessionRepository;
                            String str4 = anonymousClass2.$sessionID;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$0 = anonymousClass2;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.L$1 = null;
                            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.label = 3;
                        } catch (Exception e4) {
                            e = e4;
                            anonymousClass22 = anonymousClass2;
                            str2 = anonymousClass22.this$0.TAG;
                            Boxing.boxInt(Log.e(str2, "Exception updateIsPending " + e.getMessage()));
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
            }
            classInCourseViewModel$sendPracticeExamSync$1$2$emit$1 = new ClassInCourseViewModel$sendPracticeExamSync$1$2$emit$1(this, continuation);
            Object obj2 = classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = classInCourseViewModel$sendPracticeExamSync$1$2$emit$1.label;
            if (i != 0) {
            }
            Pair<Integer, Integer> validateQuestionsStatus2 = SummaryExamUtil.INSTANCE.validateQuestionsStatus((List) obj2);
            int intValue3 = validateQuestionsStatus2.component1().intValue();
            int intValue22 = validateQuestionsStatus2.component2().intValue();
            LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
            if (apiResult2 != null) {
            }
            if (apiResult2 != null) {
            }
            companion2.setLog(anonymousClass2.$context, "sendPracticeExamSync result " + ((apiResult2 != null || (data4 = apiResult2.getData()) == null) ? null : data4.getResult()) + ", url: " + ((apiResult2 != null || (data3 = apiResult2.getData()) == null) ? null : data3.getUrl()), null, false);
            if ((apiResult2 == null ? apiResult2.getStatus() : null) != EnumApiStatus.SUCCESS) {
            }
            return coroutine_suspended2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((ApiResult<SessionPracticeExamResponse>) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
