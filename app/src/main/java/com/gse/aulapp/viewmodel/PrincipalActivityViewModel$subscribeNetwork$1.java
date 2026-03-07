package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumPermissionsApp;
import com.gse.aulapp.util.ActivityUtil;
import com.gse.aulapp.util.ConnectivityObserver;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.NetworkConnectivityObserver;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.karumi.dexter.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1", f = "PrincipalActivityViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PrincipalActivityViewModel$subscribeNetwork$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $context;
    int label;
    final /* synthetic */ PrincipalActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrincipalActivityViewModel$subscribeNetwork$1(PrincipalActivityViewModel principalActivityViewModel, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = principalActivityViewModel;
        this.$context = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrincipalActivityViewModel$subscribeNetwork$1(this.this$0, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConnectivityObserver connectivityObserver;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PrincipalActivityViewModel principalActivityViewModel = this.this$0;
            Context applicationContext = GeneralApp.INSTANCE.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            principalActivityViewModel.connectivityObserver = new NetworkConnectivityObserver(applicationContext);
            connectivityObserver = this.this$0.connectivityObserver;
            if (connectivityObserver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityObserver");
                connectivityObserver = null;
            }
            Flow<ConnectivityObserver.Status> observe = connectivityObserver.observe();
            final PrincipalActivityViewModel principalActivityViewModel2 = this.this$0;
            final Activity activity = this.$context;
            FlowCollector<? super ConnectivityObserver.Status> flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1$1$1", f = "PrincipalActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;

                    public C00131(Continuation continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C00131(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        DialogNormalUtil.INSTANCE.closeGlobalDialog();
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C00131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1$1$2", f = "PrincipalActivityViewModel.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Activity $context;
                    int label;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1$1$2$1", f = "PrincipalActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Activity $context;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00141(Activity activity, Continuation continuation) {
                            super(2, continuation);
                            this.$context = activity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C00141(this.$context, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, this.$context, EnumDialogType.WARNING_FAIL_GPS_NFC_FLIGHT_MODE, null, null, 12, null);
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C00141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(Activity activity, Continuation<?> continuation) {
                        super(2, continuation);
                        this.$context = activity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$context, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            ActivityUtil.Companion companion = ActivityUtil.INSTANCE;
                            Activity activity = this.$context;
                            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            Fragment currentFragmentFromActivity = companion.getCurrentFragmentFromActivity((FragmentActivity) activity);
                            if (currentFragmentFromActivity != null && (currentFragmentFromActivity instanceof ClassPracticeBeforeFragment)) {
                                MainCoroutineDispatcher main = Dispatchers.getMain();
                                C00141 c00141 = new C00141(this.$context, null);
                                this.label = 1;
                                if (BuildersKt.withContext(main, c00141, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: com.gse.aulapp.viewmodel.PrincipalActivityViewModel$subscribeNetwork$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ConnectivityObserver.Status.values().length];
                        try {
                            iArr[ConnectivityObserver.Status.Available.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ConnectivityObserver.Status.Unavailable.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ConnectivityObserver.Status.Losing.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[ConnectivityObserver.Status.Lost.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation<? super Unit> continuation) {
                    return emit((ConnectivityObserver.Status) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ConnectivityObserver.Status status, Continuation<? super Unit> continuation) {
                    String unused;
                    String unused2;
                    unused = PrincipalActivityViewModel.this.TAG;
                    Objects.toString(status);
                    ActivityUtil.Companion companion = ActivityUtil.INSTANCE;
                    Activity activity2 = activity;
                    Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    Fragment currentFragmentFromActivity = companion.getCurrentFragmentFromActivity((FragmentActivity) activity2);
                    unused2 = PrincipalActivityViewModel.this.TAG;
                    Objects.toString(status);
                    Objects.toString(currentFragmentFromActivity);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                    if (i2 == 1) {
                        PrincipalActivityViewModel.this.saveHistoricPermission(EnumPermissionsApp.CONNECTION, true);
                        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new C00131(null), continuation);
                        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
                    }
                    if (i2 != 2 && i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PrincipalActivityViewModel.this.saveHistoricPermission(EnumPermissionsApp.CONNECTION, false);
                    Object withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(activity, null), continuation);
                    return withContext2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext2 : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (observe.collect(flowCollector, this) == coroutine_suspended) {
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
        return ((PrincipalActivityViewModel$subscribeNetwork$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
