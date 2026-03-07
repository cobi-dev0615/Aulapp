package com.gse.aulapp.viewmodel;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumPermissionsApp;
import com.gse.aulapp.util.ActivityUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$handlerStatusChangeNfc$1", f = "PrincipalActivityViewModel.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PrincipalActivityViewModel$handlerStatusChangeNfc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $context;
    final /* synthetic */ boolean $isEnabled;
    int label;
    final /* synthetic */ PrincipalActivityViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$handlerStatusChangeNfc$1$1", f = "PrincipalActivityViewModel.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.PrincipalActivityViewModel$handlerStatusChangeNfc$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $context;
        final /* synthetic */ boolean $isEnabled;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$handlerStatusChangeNfc$1$1$1", f = "PrincipalActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gse.aulapp.viewmodel.PrincipalActivityViewModel$handlerStatusChangeNfc$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Activity $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00121(Activity activity, Continuation<? super C00121> continuation) {
                super(2, continuation);
                this.$context = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00121(this.$context, continuation);
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
                return ((C00121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, boolean z, Continuation<?> continuation) {
            super(2, continuation);
            this.$context = activity;
            this.$isEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$isEnabled, continuation);
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
                if (this.$isEnabled) {
                    DialogNormalUtil.INSTANCE.closeGlobalDialog();
                } else if (currentFragmentFromActivity != null && (currentFragmentFromActivity instanceof ClassPracticeBeforeFragment)) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C00121 c00121 = new C00121(this.$context, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, c00121, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrincipalActivityViewModel$handlerStatusChangeNfc$1(PrincipalActivityViewModel principalActivityViewModel, boolean z, Activity activity, Continuation<? super PrincipalActivityViewModel$handlerStatusChangeNfc$1> continuation) {
        super(2, continuation);
        this.this$0 = principalActivityViewModel;
        this.$isEnabled = z;
        this.$context = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrincipalActivityViewModel$handlerStatusChangeNfc$1(this.this$0, this.$isEnabled, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String unused;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.saveHistoricPermission(EnumPermissionsApp.NFC, this.$isEnabled);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$isEnabled, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused2) {
            unused = this.this$0.TAG;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrincipalActivityViewModel$handlerStatusChangeNfc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
