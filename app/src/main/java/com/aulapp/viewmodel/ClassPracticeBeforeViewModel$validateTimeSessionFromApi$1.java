package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.navigation.NavController;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.R;
import com.gse.aulapp.model.converter.SessionDataConverter;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.SessionInstructorObjectResponse;
import com.gse.aulapp.model.response.SessionInstructorResponse;
import com.gse.aulapp.model.response.SessionResponse;
import com.gse.aulapp.util.ClassUtil;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.SingleLiveEvent;
import com.gse.aulapp.util.UtilString;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1;
import com.karumi.dexter.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {434}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ NavController $findNavController;
    final /* synthetic */ boolean $isEnter;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SessionInstructorRequest $sessionInstructorRequest;
    final /* synthetic */ EnumClassType $sessionType;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionInstructorResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends SessionInstructorResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$context = context;
            this.this$0 = classPracticeBeforeViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionInstructorResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<SessionInstructorResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SingleLiveEvent singleLiveEvent;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("validateTimeSessionFromApi exception: ", th.getMessage()), "validateTimeSessionFromApi", true);
            singleLiveEvent = this.this$0._messageValidation;
            singleLiveEvent.postValue(new Status.Exception(th));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<SessionInstructorResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nClassPracticeBeforeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassPracticeBeforeViewModel.kt\ncom/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1278:1\n1863#2:1279\n1863#2,2:1280\n1864#2:1282\n*S KotlinDebug\n*F\n+ 1 ClassPracticeBeforeViewModel.kt\ncom/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1$2\n*L\n453#1:1279\n454#1:1280,2\n453#1:1282\n*E\n"})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Context $context;
        final /* synthetic */ NavController $findNavController;
        final /* synthetic */ boolean $isEnter;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ EnumClassType $sessionType;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        public AnonymousClass2(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Context context, Activity activity, String str, boolean z, EnumClassType enumClassType, NavController navController) {
            this.this$0 = classPracticeBeforeViewModel;
            this.$context = context;
            this.$activity = activity;
            this.$sessionId = str;
            this.$isEnter = z;
            this.$sessionType = enumClassType;
            this.$findNavController = navController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$11$lambda$10(final ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Date date, Date date2, final Context context, SessionDto sessionDto, final ApiResult<SessionInstructorResponse> apiResult, final Activity activity, final boolean z, final EnumClassType enumClassType, final NavController navController, final String str) {
            SingleLiveEvent singleLiveEvent;
            SingleLiveEvent singleLiveEvent2;
            String unused;
            unused = classPracticeBeforeViewModel.TAG;
            Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).parse(str);
            if (date != null && parse != null) {
                ClassUtil classUtil = new ClassUtil();
                Intrinsics.checkNotNull(date2);
                singleLiveEvent = classPracticeBeforeViewModel._configSession;
                ConfigurationSessionDto configurationSessionDto = (ConfigurationSessionDto) singleLiveEvent.getValue();
                int minToleranceEntryBefore = configurationSessionDto != null ? configurationSessionDto.getMinToleranceEntryBefore() : 20;
                singleLiveEvent2 = classPracticeBeforeViewModel._configSession;
                ConfigurationSessionDto configurationSessionDto2 = (ConfigurationSessionDto) singleLiveEvent2.getValue();
                classUtil.classStartsSoon(date, date2, minToleranceEntryBefore, configurationSessionDto2 != null ? configurationSessionDto2.getMinToleranceEntryAfter() : 20, context, parse, sessionDto.getStatusAppointment(), new Function1() { // from class: com.gse.aulapp.viewmodel.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit emit$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        emit$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7 = ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1.AnonymousClass2.emit$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(ClassPracticeBeforeViewModel.this, str, apiResult, activity, context, z, enumClassType, navController, booleanValue);
                        return emit$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7;
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(ClassPracticeBeforeViewModel this$0, String datetime, ApiResult apiResponse, Activity activity, Context context, boolean z, EnumClassType sessionType, NavController findNavController, boolean z2) {
            SingleLiveEvent singleLiveEvent;
            SingleLiveEvent singleLiveEvent2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(datetime, "$datetime");
            Intrinsics.checkNotNullParameter(apiResponse, "$apiResponse");
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(sessionType, "$sessionType");
            Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
            if (z2) {
                singleLiveEvent2 = this$0._messageValidation;
                singleLiveEvent2.postValue(new Status.Success(datetime));
            } else {
                singleLiveEvent = this$0._messageValidation;
                singleLiveEvent.postValue(new Status.Failure(new Exception(apiResponse.getMessage())));
                this$0.showDialogTimePassed(activity, context, z, sessionType, findNavController);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((ApiResult<SessionInstructorResponse>) obj, (Continuation<? super Unit>) continuation);
        }

        public final Object emit(final ApiResult<SessionInstructorResponse> apiResult, Continuation<? super Unit> continuation) {
            SingleLiveEvent singleLiveEvent;
            SingleLiveEvent singleLiveEvent2;
            List<SessionInstructorObjectResponse> emptyList;
            SingleLiveEvent singleLiveEvent3;
            SingleLiveEvent singleLiveEvent4;
            SingleLiveEvent singleLiveEvent5;
            final Date date;
            String end;
            SessionInstructorResponse.Result result;
            SingleLiveEvent singleLiveEvent6;
            SessionInstructorResponse.Result result2;
            String unused;
            r5 = null;
            Date date2 = null;
            if (apiResult.getStatus() == EnumApiStatus.SUCCESS) {
                SessionInstructorResponse data = apiResult.getData();
                if ((data == null || (result2 = data.getResult()) == null) ? false : Intrinsics.areEqual(result2.getSuccess(), Boxing.boxBoolean(true))) {
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
                    SessionInstructorResponse.Result result3 = apiResult.getData().getResult();
                    String message = result3 != null ? result3.getMessage() : null;
                    SessionInstructorResponse.Result result4 = apiResult.getData().getResult();
                    ErrorResponse errorEndpoint = classPracticeBeforeViewModel.getErrorEndpoint(message, result4 != null ? result4.getCode() : null);
                    singleLiveEvent6 = this.this$0._messageValidation;
                    singleLiveEvent6.postValue(new Status.Exception(errorEndpoint));
                }
                LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                Context context = this.$context;
                SessionInstructorResponse data2 = apiResult.getData();
                SessionInstructorResponse.Result result5 = data2 != null ? data2.getResult() : null;
                SessionInstructorResponse data3 = apiResult.getData();
                LogSendUtil.Companion.setLog$default(companion, context, "validateTimeSessionFromApi success: " + result5 + ", url: " + (data3 != null ? data3.getUrl() : null), null, false, 12, null);
                SessionInstructorResponse data4 = apiResult.getData();
                if (data4 == null || (result = data4.getResult()) == null || (emptyList = result.getData()) == null) {
                    emptyList = CollectionsKt.emptyList();
                }
                if (emptyList.isEmpty()) {
                    Context context2 = this.$context;
                    SessionInstructorResponse data5 = apiResult.getData();
                    SessionInstructorResponse.Result result6 = data5 != null ? data5.getResult() : null;
                    SessionInstructorResponse data6 = apiResult.getData();
                    LogSendUtil.Companion.setLog$default(companion, context2, "validateTimeSessionFromApi error: " + result6 + ", url: " + (data6 != null ? data6.getUrl() : null), null, false, 12, null);
                    unused = this.this$0.TAG;
                    singleLiveEvent3 = this.this$0._messageValidation;
                    singleLiveEvent3.postValue(new Status.Failure(new Exception(apiResult.getMessage())));
                } else if (apiResult.getData() != null) {
                    final Activity activity = this.$activity;
                    String str = this.$sessionId;
                    final ClassPracticeBeforeViewModel classPracticeBeforeViewModel2 = this.this$0;
                    final Context context3 = this.$context;
                    final boolean z = this.$isEnter;
                    final EnumClassType enumClassType = this.$sessionType;
                    final NavController navController = this.$findNavController;
                    Iterator<T> it = emptyList.iterator();
                    SessionResponse sessionResponse = null;
                    while (it.hasNext()) {
                        List<SessionResponse> sessions = ((SessionInstructorObjectResponse) it.next()).getSessions();
                        if (sessions != null) {
                            for (SessionResponse sessionResponse2 : sessions) {
                                if (Intrinsics.areEqual(sessionResponse2.getId(), str)) {
                                    sessionResponse = sessionResponse2;
                                }
                            }
                        }
                    }
                    if (sessionResponse != null) {
                        SessionDataConverter.Companion companion2 = SessionDataConverter.INSTANCE;
                        singleLiveEvent4 = classPracticeBeforeViewModel2._configSession;
                        ConfigurationSessionDto configurationSessionDto = (ConfigurationSessionDto) singleLiveEvent4.getValue();
                        int minToleranceEntryBefore = configurationSessionDto != null ? configurationSessionDto.getMinToleranceEntryBefore() : 20;
                        singleLiveEvent5 = classPracticeBeforeViewModel2._configSession;
                        ConfigurationSessionDto configurationSessionDto2 = (ConfigurationSessionDto) singleLiveEvent5.getValue();
                        final SessionDto sessionDtoBySessionResponse = companion2.getSessionDtoBySessionResponse(sessionResponse, minToleranceEntryBefore, configurationSessionDto2 != null ? configurationSessionDto2.getMinToleranceEntryAfter() : 20);
                        if (sessionDtoBySessionResponse != null) {
                            String date3 = sessionDtoBySessionResponse.getDate();
                            if (date3 != null) {
                                String start = sessionDtoBySessionResponse.getStart();
                                date = start != null ? DateUtil.INSTANCE.getDateFromString(date3, start) : null;
                            } else {
                                date = null;
                            }
                            String date4 = sessionDtoBySessionResponse.getDate();
                            if (date4 != null && (end = sessionDtoBySessionResponse.getEnd()) != null) {
                                date2 = DateUtil.INSTANCE.getDateFromString(date4, end);
                            }
                            final Date date5 = date2;
                            ExternalUtil.INSTANCE.getDateTime(activity, EnumTimeClass.GET_DATE_TIME, new Function1() { // from class: com.gse.aulapp.viewmodel.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit emit$lambda$11$lambda$10;
                                    SessionDto sessionDto = sessionDtoBySessionResponse;
                                    ApiResult apiResult2 = apiResult;
                                    boolean z2 = z;
                                    EnumClassType enumClassType2 = enumClassType;
                                    emit$lambda$11$lambda$10 = ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1.AnonymousClass2.emit$lambda$11$lambda$10(ClassPracticeBeforeViewModel.this, date, date5, context3, sessionDto, apiResult2, activity, z2, enumClassType2, navController, (String) obj);
                                    return emit$lambda$11$lambda$10;
                                }
                            });
                        }
                    }
                    return Unit.INSTANCE;
                }
            } else if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                LogSendUtil.Companion companion3 = LogSendUtil.INSTANCE;
                Context context4 = this.$context;
                SessionInstructorResponse data7 = apiResult.getData();
                SessionInstructorResponse.Result result7 = data7 != null ? data7.getResult() : null;
                SessionInstructorResponse data8 = apiResult.getData();
                LogSendUtil.Companion.setLog$default(companion3, context4, "validateTimeSessionFromApi error: " + result7 + ", url: " + (data8 != null ? data8.getUrl() : null), null, false, 12, null);
                Integer statusCode = apiResult.getStatusCode();
                if (statusCode != null && statusCode.intValue() == 401) {
                    singleLiveEvent2 = this.this$0._messageValidation;
                    singleLiveEvent2.postValue(new Status.Failure(new Exception("401")));
                } else {
                    String extractErrorMessage = UtilString.INSTANCE.extractErrorMessage(String.valueOf(apiResult.getMessage()));
                    if (extractErrorMessage == null) {
                        extractErrorMessage = this.$context.getString(R.string.dialog_fullscreen_error_get_sessions);
                        Intrinsics.checkNotNullExpressionValue(extractErrorMessage, "getString(...)");
                    }
                    singleLiveEvent = this.this$0._messageValidation;
                    singleLiveEvent.postValue(new Status.Failure(new Exception(extractErrorMessage)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Context context, SessionInstructorRequest sessionInstructorRequest, Activity activity, String str, boolean z, EnumClassType enumClassType, NavController navController, Continuation<? super ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1> continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$context = context;
        this.$sessionInstructorRequest = sessionInstructorRequest;
        this.$activity = activity;
        this.$sessionId = str;
        this.$isEnter = z;
        this.$sessionType = enumClassType;
        this.$findNavController = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1(this.this$0, this.$context, this.$sessionInstructorRequest, this.$activity, this.$sessionId, this.$isEnter, this.$sessionType, this.$findNavController, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            singleLiveEvent = this.this$0._messageValidation;
            singleLiveEvent.postValue(new Status.Loading(false, 1, null));
            LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, this.$context, "validateTimeSessionFromApi request: " + this.$sessionInstructorRequest, null, false, 12, null);
            sessionRepository = this.this$0.repository;
            Flow m1541catch = FlowKt.m1541catch(sessionRepository.getSessionApi(this.$context, this.$sessionInstructorRequest), new AnonymousClass1(this.$context, this.this$0, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$context, this.$activity, this.$sessionId, this.$isEnter, this.$sessionType, this.$findNavController);
            this.label = 1;
            if (m1541catch.collect(anonymousClass2, this) == coroutine_suspended) {
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
        return ((ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
