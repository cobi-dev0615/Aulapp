package com.gse.aulapp.util;

import android.app.Activity;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.enumerate.EnumApps;
import com.gse.aulapp.model.repository.ParameterListRepository;
import com.gse.aulapp.model.request.ParameterListRequest;
import com.gse.aulapp.model.response.ParameterListResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.LoadConfigurationUtil$Companion$saveParameterListOnPreference$1", f = "LoadConfigurationUtil.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LoadConfigurationUtil$Companion$saveParameterListOnPreference$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $context;
    int label;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/ParameterListResponse;", "it", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.util.LoadConfigurationUtil$Companion$saveParameterListOnPreference$1$1", f = "LoadConfigurationUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.util.LoadConfigurationUtil$Companion$saveParameterListOnPreference$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends ParameterListResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, Continuation continuation) {
            super(3, continuation);
            this.$context = activity;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends ParameterListResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<ParameterListResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("saveParameterListOnPreference exception: ", th.getMessage()), "saveParameterListOnPreference", true);
            DialogUtil.INSTANCE.showErrorGeneralDialogGlobal(this.$context, th.getMessage());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<ParameterListResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadConfigurationUtil$Companion$saveParameterListOnPreference$1(Activity activity, Continuation continuation) {
        super(2, continuation);
        this.$context = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new LoadConfigurationUtil$Companion$saveParameterListOnPreference$1(this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ParameterListRepository parameterListRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ParameterListRequest parameterListRequest = new ParameterListRequest(null, 1, null);
            LogSendUtil.INSTANCE.setLog(this.$context, "saveParameterListOnPreference request: " + parameterListRequest, null, false);
            parameterListRepository = LoadConfigurationUtil.parameterListRepository;
            Flow m1541catch = FlowKt.m1541catch(parameterListRepository.getParameterList(this.$context, parameterListRequest), new AnonymousClass1(this.$context, null));
            final Activity activity = this.$context;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.util.LoadConfigurationUtil$Companion$saveParameterListOnPreference$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ApiResult<ParameterListResponse>) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object emit(ApiResult<ParameterListResponse> apiResult, Continuation continuation) {
                    ParameterListResponse.Data data;
                    String scheduleExamsURL;
                    ParameterListResponse.Data data2;
                    ParameterListResponse.Data data3;
                    if (apiResult instanceof ApiResult.Failure) {
                        ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                        LogSendUtil.INSTANCE.setLog(activity, "saveParameterListOnPreference error: " + failure.getData(), "saveParameterListOnPreference", true);
                        DialogUtil.INSTANCE.showErrorGeneralDialogGlobal(activity, failure.getMessage());
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ApiResult.Success success = (ApiResult.Success) apiResult;
                        ParameterListResponse parameterListResponse = (ParameterListResponse) success.getData();
                        if (parameterListResponse != null) {
                            parameterListResponse.getResult();
                        }
                        ParameterListResponse parameterListResponse2 = (ParameterListResponse) success.getData();
                        String str = null;
                        if ((parameterListResponse2 != null ? parameterListResponse2.getResult() : null) != null) {
                            LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                            companion.setLog(activity, "saveParameterListOnPreference Success: " + ((ParameterListResponse) success.getData()).getResult() + ", url: " + ((ParameterListResponse) success.getData()).getUrl(), null, false);
                            PreferenceUtil.Companion companion2 = PreferenceUtil.INSTANCE;
                            Activity activity2 = activity;
                            ParameterListResponse.Result result = ((ParameterListResponse) success.getData()).getResult();
                            companion2.saveValidationsPercentage(activity2, (result == null || (data3 = result.getData()) == null) ? null : data3.getValidationsPercentage());
                            EnumApps.Companion companion3 = EnumApps.INSTANCE;
                            ParameterListResponse.Result result2 = ((ParameterListResponse) success.getData()).getResult();
                            if (result2 != null && (data2 = result2.getData()) != null) {
                                str = data2.getEntryValidation();
                            }
                            EnumApps enumByNameString = companion3.getEnumByNameString(str);
                            String userId = companion2.getUserId(activity);
                            String str2 = BuildConfig.FLAVOR;
                            if (userId == null) {
                                userId = BuildConfig.FLAVOR;
                            }
                            String t = userId.length() > 0 ? "?userID=[userId]".replace("[userId]", userId) : BuildConfig.FLAVOR;
                            ParameterListResponse.Result result3 = ((ParameterListResponse) success.getData()).getResult();
                            if (result3 != null && (data = result3.getData()) != null && (scheduleExamsURL = data.getScheduleExamsURL()) != null) {
                                str2 = scheduleExamsURL;
                            }
                            if (str2.length() > 0) {
                                str2 = defpackage.a.l(str2, t);
                            }
                            String str3 = str2;
                            companion.setLog(activity, q.i("saveParameterListOnPreference scheduleExamsURL: ", str3), null, false);
                            companion2.saveScheduleExamsUrl(activity, str3);
                            companion2.saveEntryValidation(activity, enumByNameString);
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
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LoadConfigurationUtil$Companion$saveParameterListOnPreference$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
