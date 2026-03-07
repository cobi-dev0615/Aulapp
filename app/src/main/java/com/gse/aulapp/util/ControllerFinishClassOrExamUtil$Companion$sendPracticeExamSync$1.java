package com.gse.aulapp.util;

import android.content.Context;
import android.util.Log;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import com.gse.aulapp.util.LogSendUtil;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1", f = "ControllerFinishClassOrExamUtil.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NavController $findNavController;
    final /* synthetic */ NavDirections $navDirections;
    final /* synthetic */ SessionRepository $repository;
    final /* synthetic */ String $sessionID;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1", f = "ControllerFinishClassOrExamUtil.kt", i = {}, l = {45, 67}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ NavController $findNavController;
        final /* synthetic */ NavDirections $navDirections;
        final /* synthetic */ SessionRepository $repository;
        final /* synthetic */ String $sessionID;
        int label;

        @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionPracticeExamResponse;", "it", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$2", f = "ControllerFinishClassOrExamUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends SessionPracticeExamResponse>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Context context, Continuation<?> continuation) {
                super(3, (Continuation<Object>) continuation);
                this.$context = context;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionPracticeExamResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super ApiResult<SessionPracticeExamResponse>>) flowCollector, th, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LogSendUtil.INSTANCE.setLog(this.$context, q.i("sendPracticeExamSync exception ", ((Throwable) this.L$0).getMessage()), "sendPracticeExamSync", true);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super ApiResult<SessionPracticeExamResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, (Continuation) continuation);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, SessionRepository sessionRepository, NavController navController, NavDirections navDirections, Continuation<?> continuation) {
            super(2, (Continuation<Object>) continuation);
            this.$context = context;
            this.$sessionID = str;
            this.$repository = sessionRepository;
            this.$findNavController = navController;
            this.$navDirections = navDirections;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 instance = new AnonymousClass1(this.$context, this.$sessionID, this.$repository, this.$findNavController, this.$navDirections, (Continuation) continuation);
            return (Continuation<Unit>) (Object) instance;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
        
            if (r0.collect(r4, r18) != r2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        
            if (r5.updateDateEndClass(r7, r6, r18) == r2) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(this.$context, q.i("sendPracticeExamSync  updateDateEndClass exception ", e.getMessage()), null, false);
                String unused = ControllerFinishClassOrExamUtil.TAG;
                e.getMessage();
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Long dateLong = DateUtil.INSTANCE.getDateLong();
                if (dateLong != null) {
                    SessionRepository sessionRepository = this.$repository;
                    String str = this.$sessionID;
                    long longValue = dateLong.longValue();
                    this.label = 1;
                }
                LogSendUtil.INSTANCE.setLog(this.$context, q.i("sendPracticeExamSync request ", this.$sessionID), null, false);
                Flow m1541catch = this.$repository.sendSessionPracticeAndSyncPracticalRequest2(this.$context, this.$sessionID);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$repository, this.$sessionID, this.$context, this.$findNavController, this.$navDirections);
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
            Flow m1541catch2 = this.$repository.sendSessionPracticeAndSyncPracticalRequest2(this.$context, this.$sessionID);
            AnonymousClass3 anonymousClass32 = new AnonymousClass3(this.$repository, this.$sessionID, this.$context, this.$findNavController, this.$navDirections);
            this.label = 2;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            final /* synthetic */ Context $context;
            final /* synthetic */ NavController $findNavController;
            final /* synthetic */ NavDirections $navDirections;
            final /* synthetic */ SessionRepository $repository;
            final /* synthetic */ String $sessionID;

            public AnonymousClass3(SessionRepository sessionRepository, String str, Context context, NavController navController, NavDirections navDirections) {
                this.$repository = sessionRepository;
                this.$sessionID = str;
                this.$context = context;
                this.$findNavController = navController;
                this.$navDirections = navDirections;
            }

            /* JADX WARN: Code restructure failed: missing block: B:99:0x024a, code lost:
            
                if (r0.updateIsPending("1", r7, r2) == r3) goto L109;
             */
            /* JADX WARN: Removed duplicated region for block: B:105:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x016f  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x01f7  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(ApiResult<SessionPracticeExamResponse> apiResult, Continuation<? super Unit> continuation) {
                ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1 controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1;
                int i;
                ApiResult<SessionPracticeExamResponse> apiResult2 = null;
                AnonymousClass3<T> anonymousClass3 = null;
                AnonymousClass3<T> anonymousClass32;
                SessionPracticeExamResponse data;
                SessionPracticeExamResponse data2;
                ApiResult<SessionPracticeExamResponse> apiResult3;
                AnonymousClass3<T> anonymousClass33;
                int i2;
                int i3;
                SessionRepository sessionRepository;
                String str;
                SessionPracticeExamResponse data3;
                SessionPracticeExamResponse data4;
                String examResult = null;
                SessionPracticeExamResponse.Result result;
                if (continuation instanceof ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1) {
                    controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1 = (ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1) continuation;
                    int i4 = controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.label;
                    if ((i4 & IntCompanionObject.MIN_VALUE) != 0) {
                        controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.label = i4 - IntCompanionObject.MIN_VALUE;
                        Object obj = controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            SessionRepository sessionRepository2 = this.$repository;
                            String str2 = this.$sessionID;
                            controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$0 = this;
                            controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$1 = apiResult;
                            controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.label = 1;
                            obj = sessionRepository2.getAllQuestionSync(str2, controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1);
                            if (obj != coroutine_suspended) {
                                apiResult2 = apiResult;
                                anonymousClass3 = this;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                anonymousClass32 = (AnonymousClass3) controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                } catch (Exception eInner) {
                                    LogSendUtil.INSTANCE.setLog(anonymousClass32.$context, q.i("sendPracticeExamSync exception ", eInner.getMessage()), "sendPracticeExamSync", true);
                                    Boxing.boxInt(Log.e(ControllerFinishClassOrExamUtil.TAG, "Exception updateIsPending " + eInner.getMessage()));
                                    return Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            }
                            i3 = controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.I$1;
                            i2 = controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.I$0;
                            apiResult3 = (ApiResult) controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$1;
                            anonymousClass33 = (AnonymousClass3) controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Exception e2) {
                                LogSendUtil.INSTANCE.setLog(anonymousClass33.$context, q.i("sendPracticeExamSync exception ", e2.getMessage()), "sendPracticeExamSync", true);
                                String unused = ControllerFinishClassOrExamUtil.TAG;
                                e2.getMessage();
                                int i5 = i2;
                                ApiResult<SessionPracticeExamResponse> apiResult4 = apiResult3;
                                int i6 = i3;
                                SessionPracticeExamResponse data5 = apiResult4.getData();
                                if (data5 != null) {
                                }
                                if (examResult != null) {
                                }
                                ControllerFinishClassOrExamUtil.INSTANCE.showPendingFinish(anonymousClass33.$context, anonymousClass33.$sessionID, anonymousClass33.$findNavController, anonymousClass33.$navDirections);
                                return Unit.INSTANCE;
                            }
                            int i52 = i2;
                            ApiResult<SessionPracticeExamResponse> apiResult42 = apiResult3;
                            int i62 = i3;
                            SessionPracticeExamResponse data52 = apiResult42.getData();
                            examResult = (data52 != null || (result = data52.getResult()) == null) ? null : result.getExamResult();
                            if (examResult != null || examResult.length() == 0) {
                                ControllerFinishClassOrExamUtil.INSTANCE.showPendingFinish(anonymousClass33.$context, anonymousClass33.$sessionID, anonymousClass33.$findNavController, anonymousClass33.$navDirections);
                            } else if (examResult != null) {
                                int hashCode = examResult.hashCode();
                                if (hashCode != -1779119228) {
                                    if (hashCode != 1510488259) {
                                        if (hashCode == 2021951926 && examResult.equals("APROBADO")) {
                                            ControllerFinishClassOrExamUtil.INSTANCE.showDialogPassExam(anonymousClass33.$context, true, i52, i62, anonymousClass33.$sessionID, anonymousClass33.$findNavController, anonymousClass33.$navDirections);
                                        }
                                    } else if (examResult.equals("PENDIENTE POR FINALIZAR")) {
                                        ControllerFinishClassOrExamUtil.INSTANCE.showPendingFinish(anonymousClass33.$context, anonymousClass33.$sessionID, anonymousClass33.$findNavController, anonymousClass33.$navDirections);
                                    }
                                } else if (examResult.equals("REPROBADO")) {
                                    ControllerFinishClassOrExamUtil.INSTANCE.showDialogPassExam(anonymousClass33.$context, false, i52, i62, anonymousClass33.$sessionID, anonymousClass33.$findNavController, anonymousClass33.$navDirections);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        apiResult2 = (ApiResult) controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$1;
                        anonymousClass3 = (AnonymousClass3) controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Pair<Integer, Integer> validateQuestionsStatus = SummaryExamUtil.INSTANCE.validateQuestionsStatus((List) obj);
                        int intValue = validateQuestionsStatus.component1().intValue();
                        int intValue2 = validateQuestionsStatus.component2().intValue();
                        LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                        companion.setLog(anonymousClass3.$context, "sendPracticeExamSync result " + ((apiResult2 != null || (data4 = apiResult2.getData()) == null) ? null : data4.getResult()) + ", url: " + ((apiResult2 != null || (data3 = apiResult2.getData()) == null) ? null : data3.getUrl()), null, false);
                        if ((apiResult2 == null ? apiResult2.getStatus() : null) != EnumApiStatus.SUCCESS) {
                            Context context = anonymousClass3.$context;
                            SessionPracticeExamResponse data6 = apiResult2.getData();
                            SessionPracticeExamResponse.Result result2 = data6 != null ? data6.getResult() : null;
                            SessionPracticeExamResponse data7 = apiResult2.getData();
                            companion.setLog(context, "sendPracticeExamSync result " + result2 + ", url: " + (data7 != null ? data7.getUrl() : null), null, false);
                            try {
                                sessionRepository = anonymousClass3.$repository;
                                str = anonymousClass3.$sessionID;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$0 = anonymousClass3;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$1 = apiResult2;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.I$0 = intValue;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.I$1 = intValue2;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.label = 2;
                            } catch (Exception e3) {
                                apiResult3 = apiResult2;
                                anonymousClass33 = anonymousClass3;
                                i2 = intValue;
                                i3 = intValue2;
                                LogSendUtil.INSTANCE.setLog(anonymousClass33.$context, q.i("sendPracticeExamSync exception ", e3.getMessage()), "sendPracticeExamSync", true);
                                String unused2 = ControllerFinishClassOrExamUtil.TAG;
                                e3.getMessage();
                                int i522 = i2;
                                ApiResult<SessionPracticeExamResponse> apiResult422 = apiResult3;
                                int i622 = i3;
                                SessionPracticeExamResponse data522 = apiResult422.getData();
                                if (data522 != null) {
                                }
                                if (examResult != null) {
                                }
                                ControllerFinishClassOrExamUtil.INSTANCE.showPendingFinish(anonymousClass33.$context, anonymousClass33.$sessionID, anonymousClass33.$findNavController, anonymousClass33.$navDirections);
                                return Unit.INSTANCE;
                            }
                            if (sessionRepository.updateIsPending("0", str, controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1) != coroutine_suspended) {
                                apiResult3 = apiResult2;
                                anonymousClass33 = anonymousClass3;
                                i2 = intValue;
                                i3 = intValue2;
                                int i5222 = i2;
                                ApiResult<SessionPracticeExamResponse> apiResult4222 = apiResult3;
                                int i6222 = i3;
                                SessionPracticeExamResponse data5222 = apiResult4222.getData();
                                if (data5222 != null) {
                                }
                                if (examResult != null) {
                                }
                                ControllerFinishClassOrExamUtil.INSTANCE.showPendingFinish(anonymousClass33.$context, anonymousClass33.$sessionID, anonymousClass33.$findNavController, anonymousClass33.$navDirections);
                                return Unit.INSTANCE;
                            }
                        } else {
                            companion.setLog(anonymousClass3.$context, "sendPracticeExamSync error " + ((apiResult2 == null || (data2 = apiResult2.getData()) == null) ? null : data2.getResult()) + ", url: " + ((apiResult2 == null || (data = apiResult2.getData()) == null) ? null : data.getUrl()), null, false);
                            try {
                                SessionRepository sessionRepository3 = anonymousClass3.$repository;
                                String str3 = anonymousClass3.$sessionID;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$0 = anonymousClass3;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.L$1 = null;
                                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.label = 3;
                            } catch (Exception e4) {
                                anonymousClass32 = anonymousClass3;
                                LogSendUtil.INSTANCE.setLog(anonymousClass32.$context, q.i("sendPracticeExamSync exception ", e4.getMessage()), "sendPracticeExamSync", true);
                                Boxing.boxInt(Log.e(ControllerFinishClassOrExamUtil.TAG, "Exception updateIsPending " + e4.getMessage()));
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1 = new ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1(this, continuation);
                Object obj2 = controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = controllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1.label;
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
                companion2.setLog(anonymousClass3.$context, "sendPracticeExamSync result " + ((apiResult2 != null || (data4 = apiResult2.getData()) == null) ? null : data4.getResult()) + ", url: " + ((apiResult2 != null || (data3 = apiResult2.getData()) == null) ? null : data3.getUrl()), null, false);
                if ((apiResult2 == null ? apiResult2.getStatus() : null) != EnumApiStatus.SUCCESS) {
                }
                return coroutine_suspended2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation<? super Unit> continuation) {
                return emit((ApiResult<SessionPracticeExamResponse>) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1(Context context, String str, SessionRepository sessionRepository, NavController navController, NavDirections navDirections, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$sessionID = str;
        this.$repository = sessionRepository;
        this.$findNavController = navController;
        this.$navDirections = navDirections;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1 instance = new ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1(this.$context, this.$sessionID, this.$repository, this.$findNavController, this.$navDirections, (Continuation) continuation);
        return (Continuation<Unit>) (Object) instance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$sessionID, this.$repository, this.$findNavController, this.$navDirections, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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
        return ((ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
