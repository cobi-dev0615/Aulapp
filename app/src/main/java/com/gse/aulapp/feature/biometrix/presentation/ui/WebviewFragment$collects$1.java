package com.gse.aulapp.feature.biometrix.presentation.ui;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.gse.aulapp.model.data.statusControl.BiometricResult;
import com.gse.aulapp.model.data.statusControl.BiometrixResult;
import com.gse.aulapp.receptions.feature.biometrix.presentation.ui.viewmodel.WebviewViewModel;
import com.karumi.dexter.BuildConfig;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment$collects$1", f = "WebviewFragment.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class WebviewFragment$collects$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebviewFragment this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment$collects$1$1", f = "WebviewFragment.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment$collects$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WebviewFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebviewFragment webviewFragment, Continuation<?> continuation) {
            super(2, (Continuation<Object>) continuation);
            this.this$0 = webviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return (Continuation<Unit>) (Object) new AnonymousClass1(this.this$0, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WebviewViewModel webviewViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                webviewViewModel = this.this$0.viewModel;
                if (webviewViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    webviewViewModel = null;
                }
                SharedFlow<BiometricResult> responseBiometric = webviewViewModel.getResponseBiometric();
                final WebviewFragment webviewFragment = this.this$0;
                FlowCollector<? super BiometricResult> flowCollector = new FlowCollector() { // from class: com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment.collects.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((BiometricResult) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(BiometricResult biometricResult, Continuation continuation) {
                        String str;
                        boolean z = biometricResult instanceof BiometricResult.Complete;
                        if (z || (biometricResult instanceof BiometricResult.Error)) {
                            if (z) {
                                BiometricResult.Complete complete = (BiometricResult.Complete) biometricResult;
                                if (complete.getData() instanceof BiometrixResult) {
                                    webviewFragment.handlerBiometricResult((BiometrixResult) complete.getData());
                                }
                            }
                            if (biometricResult instanceof BiometricResult.Error) {
                                BiometricResult.Error error = (BiometricResult.Error) biometricResult;
                                if (error.getData() instanceof BiometrixResult) {
                                    webviewFragment.handlerBiometricResult((BiometrixResult) error.getData());
                                }
                            }
                            str = webviewFragment.TAG;
                            Boxing.boxInt(Log.e(str, "collects: BiometricResult is not Complete or Error"));
                        } else if (!Intrinsics.areEqual(biometricResult, BiometricResult.EmptyObject.INSTANCE) && !Intrinsics.areEqual(biometricResult, BiometricResult.LoadingLibrary.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (responseBiometric.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewFragment$collects$1(WebviewFragment webviewFragment, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.this$0 = webviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new WebviewFragment$collects$1(this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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
        return ((WebviewFragment$collects$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
