package com.gse.aulapp.feature.biometrix.presentation.ui;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.lifecycle.SavedStateHandle;
import com.gse.aulapp.model.data.statusControl.BiometrixResult;
import com.gse.aulapp.model.enumerate.EnumBiometrixStatus;
import com.gse.aulapp.receptions.feature.biometrix.presentation.ui.viewmodel.WebviewViewModel;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment$handlerBiometricResult$1", f = "WebviewFragment.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class WebviewFragment$handlerBiometricResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BiometrixResult $data;
    int label;
    final /* synthetic */ WebviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewFragment$handlerBiometricResult$1(BiometrixResult biometrixResult, WebviewFragment webviewFragment, Continuation<? super WebviewFragment$handlerBiometricResult$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$data = biometrixResult;
        this.this$0 = webviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new WebviewFragment$handlerBiometricResult$1(this.$data, this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebviewViewModel webviewViewModel;
        SavedStateHandle savedStateHandle;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$data.getStatus() != EnumBiometrixStatus.ONBACKPRESSED) {
                this.label = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        NavController findNavController = FragmentKt.findNavController(this.this$0);
        NavBackStackEntry previousBackStackEntry = findNavController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("result_key", this.$data);
        }
        webviewViewModel = this.this$0.viewModel;
        if (webviewViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            webviewViewModel = null;
        }
        webviewViewModel.resetState();
        findNavController.popBackStack();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebviewFragment$handlerBiometricResult$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
