package com.gse.aulapp.model.repository;

import android.content.Context;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.enumerate.EnumStatusAppointment;
import com.gse.aulapp.model.request.StatusAppointmentRequest;
import com.gse.aulapp.model.response.HistoricRecordPermissionsChangeResponse;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/HistoricRecordPermissionsChangeResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository$sendSessionStatusAppointment$1", f = "SessionRepository.kt", i = {0, 1, 2}, l = {467, 474, 484, 493}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionRepository$sendSessionStatusAppointment$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends HistoricRecordPermissionsChangeResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $sessionID;
    final /* synthetic */ EnumStatusAppointment $sessionStatus;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$sendSessionStatusAppointment$1(String str, EnumStatusAppointment enumStatusAppointment, Context context, Continuation<? super SessionRepository$sendSessionStatusAppointment$1> continuation) {
        super(2, continuation);
        this.$sessionID = str;
        this.$sessionStatus = enumStatusAppointment;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SessionRepository$sendSessionStatusAppointment$1 sessionRepository$sendSessionStatusAppointment$1 = new SessionRepository$sendSessionStatusAppointment$1(this.$sessionID, this.$sessionStatus, this.$context, continuation);
        sessionRepository$sendSessionStatusAppointment$1.L$0 = obj;
        return sessionRepository$sendSessionStatusAppointment$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends HistoricRecordPermissionsChangeResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<HistoricRecordPermissionsChangeResponse>>) flowCollector, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r1.emit(r5, r9) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        if (r1.emit(r3, r9) != r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:15:0x0026, B:18:0x0037, B:19:0x0066, B:21:0x006c, B:23:0x0072, B:25:0x007d, B:29:0x00a4, B:31:0x00aa, B:32:0x00b0, B:34:0x00b6, B:35:0x00b9, B:39:0x0043, B:41:0x005a), top: B:2:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Response response;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r1 = this.label;
        try {
        } catch (Exception e) {
            ApiResult.Failure failure = new ApiResult.Failure(500, new Exception(e.toString()));
            this.L$0 = null;
            this.label = 4;
        }
        if (r1 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            StatusAppointmentRequest statusAppointmentRequest = new StatusAppointmentRequest(this.$sessionID, EnumStatusAppointment.name$default(this.$sessionStatus, null, 1, null));
            ReceptionsApiService apiService = ReceptionsAdapter.INSTANCE.getApiService(this.$context);
            if (apiService == null) {
                response = null;
                if (response != null) {
                    if (response.isSuccessful()) {
                        Object body = response.body();
                        Intrinsics.checkNotNull(body);
                        HistoricRecordPermissionsChangeResponse historicRecordPermissionsChangeResponse = (HistoricRecordPermissionsChangeResponse) body;
                        if (historicRecordPermissionsChangeResponse != null) {
                            historicRecordPermissionsChangeResponse.setUrl(response.raw().request().url().url().toString());
                            ApiResult.Success success = new ApiResult.Success(response.code(), historicRecordPermissionsChangeResponse);
                            this.L$0 = flowCollector;
                            this.label = 2;
                            if (flowCollector.emit(success, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        ResponseBody errorBody = response.errorBody();
                        String string = errorBody != null ? errorBody.string() : null;
                        ResponseBody errorBody2 = response.errorBody();
                        if (errorBody2 != null) {
                            errorBody2.close();
                        }
                        ApiResult.Failure failure2 = new ApiResult.Failure(response.code(), new Exception(string));
                        this.L$0 = flowCollector;
                        this.label = 3;
                    }
                }
                return Unit.INSTANCE;
            }
            this.L$0 = flowCollector;
            this.label = 1;
            obj = apiService.updateStatusAppointment(statusAppointmentRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                } else {
                    if (r1 != 3) {
                        if (r1 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        response = (Response) obj;
        if (response != null) {
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super ApiResult<HistoricRecordPermissionsChangeResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SessionRepository$sendSessionStatusAppointment$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
