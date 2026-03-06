package com.gse.aulapp.util;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.repository.DatetimeRepository;
import com.gse.aulapp.model.request.DatetimeRequest;
import com.gse.aulapp.model.response.DatetimeResponse;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeBiometrics$1", f = "ExternalUtil.kt", i = {}, l = {181, 200}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ExternalUtil$Companion$getDateTimeBiometrics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<String> $date;
    final /* synthetic */ EnumTimeClass $enumTime;
    final /* synthetic */ Function1<String, Unit> $listener;
    final /* synthetic */ Ref.ObjectRef<String> $time;
    int label;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/DatetimeResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeBiometrics$1$1", f = "ExternalUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeBiometrics$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends ApiResult<? extends DatetimeResponse>>>, Object> {
        final /* synthetic */ Context $context;
        int label;

        @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/DatetimeResponse;", "it", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeBiometrics$1$1$1", f = "ExternalUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeBiometrics$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00091 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends DatetimeResponse>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(Context context, Continuation<? super C00091> continuation) {
                super(3, (Continuation<Object>) continuation);
                this.$context = context;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends DatetimeResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super ApiResult<DatetimeResponse>>) flowCollector, th, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                LogSendUtil.INSTANCE.setLog(this.$context, q.i("datetime exception: ", th.getMessage()), "datetime", true);
                DialogUtil.INSTANCE.showErrorGeneralDialogGlobal(this.$context, th.getMessage());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super ApiResult<DatetimeResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00091 c00091 = new C00091(this.$context, (Continuation) continuation);
                c00091.L$0 = th;
                return c00091.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, (Continuation<Object>) continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return (Continuation<Unit>) (Object) new AnonymousClass1(this.$context, (Continuation) continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends ApiResult<? extends DatetimeResponse>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Flow<? extends ApiResult<DatetimeResponse>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DatetimeRepository datetimeRepository;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            datetimeRepository = ExternalUtil.datetimeRepository;
            return datetimeRepository.datetime(this.$context, new DatetimeRequest(Boxing.boxBoolean(true)));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<? extends ApiResult<DatetimeResponse>>> continuation) {
            return ((AnonymousClass1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExternalUtil$Companion$getDateTimeBiometrics$1(Context context, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, EnumTimeClass enumTimeClass, Function1<? super String, Unit> function1, Continuation<? super ExternalUtil$Companion$getDateTimeBiometrics$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$date = objectRef;
        this.$time = objectRef2;
        this.$enumTime = enumTimeClass;
        this.$listener = (Function1<String, Unit>) (Function1) function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ExternalUtil$Companion$getDateTimeBiometrics$1(this.$context, this.$date, this.$time, this.$enumTime, this.$listener, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r10).collect(r3, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, null);
            this.label = 1;
            obj = BuildersKt.withContext(main, anonymousClass1, this);
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
        final Context context = this.$context;
        final Ref.ObjectRef<String> objectRef = this.$date;
        final Ref.ObjectRef<String> objectRef2 = this.$time;
        final EnumTimeClass enumTimeClass = this.$enumTime;
        final Function1<String, Unit> function1 = this.$listener;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeBiometrics$1.2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeBiometrics$1$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumApiStatus.values().length];
                    try {
                        iArr[EnumApiStatus.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumApiStatus.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumApiStatus.EXCEPTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((ApiResult<DatetimeResponse>) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(ApiResult<DatetimeResponse> apiResult, Continuation<? super Unit> continuation) {
                DatetimeResponse.Result result;
                int i2 = WhenMappings.$EnumSwitchMapping$0[apiResult.getStatus().ordinal()];
                if (i2 == 1) {
                    DatetimeResponse data = apiResult.getData();
                    Object t = null;
                    if (((data == null || (result = data.getResult()) == null) ? null : result.getTime()) != null) {
                        DatetimeResponse.Result result2 = apiResult.getData().getResult();
                        if ((result2 != null ? result2.getDate() : null) != null) {
                            LogSendUtil.INSTANCE.setLog(context, "datetime succes: " + apiResult.getData().getResult() + ", url: " + apiResult.getData().getUrl(), null, false);
                            Ref.ObjectRef<String> objectRef3 = objectRef;
                            DatetimeResponse.Result result3 = apiResult.getData().getResult();
                            Object t2 = result3 != null ? result3.getDate() : null;
                            Intrinsics.checkNotNull(t2);
                            objectRef3.element = (String) t2;
                            Ref.ObjectRef<String> objectRef4 = objectRef2;
                            DatetimeResponse.Result result4 = apiResult.getData().getResult();
                            if (result4 != null) {
                                t = result4.getTime();
                            }
                            Intrinsics.checkNotNull(t);
                            objectRef4.element = (String) t;
                            ExternalUtil.Companion companion = ExternalUtil.INSTANCE;
                            ExternalUtil.datetime = ((Object) objectRef.element) + " " + ((Object) objectRef2.element);
                            ExternalUtil.datetime = ExternalUtil.INSTANCE.addSecondsToDate(String.valueOf(ExternalUtil.datetime));
                            if (enumTimeClass == EnumTimeClass.GET_DATE_TIME) {
                                Function1<String, Unit> function12 = function1;
                                String str = ExternalUtil.datetime;
                                Intrinsics.checkNotNull(str);
                                function12.invoke(str);
                            } else {
                                function1.invoke(objectRef2.element);
                            }
                        }
                    }
                    LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                    Context context2 = context;
                    DatetimeResponse data2 = apiResult.getData();
                    DatetimeResponse.Result result5 = data2 != null ? data2.getResult() : null;
                    DatetimeResponse data3 = apiResult.getData();
                    companion2.setLog(context2, "datetime error: " + result5 + ", url: " + (data3 != null ? data3.getUrl() : null), null, false);
                    function1.invoke(String.valueOf(new Date().getTime()));
                } else if (i2 == 2) {
                    function1.invoke(String.valueOf(new Date().getTime()));
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function1.invoke(String.valueOf(new Date().getTime()));
                }
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExternalUtil$Companion$getDateTimeBiometrics$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
