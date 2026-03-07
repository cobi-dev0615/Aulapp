package com.gse.aulapp.viewmodel;

import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.databinding.PrimaryButtonBinding;
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateContinueButton$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {676}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nClassPracticeBeforeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassPracticeBeforeViewModel.kt\ncom/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel$validateContinueButton$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1278:1\n1863#2,2:1279\n*S KotlinDebug\n*F\n+ 1 ClassPracticeBeforeViewModel.kt\ncom/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel$validateContinueButton$1\n*L\n661#1:1279,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$validateContinueButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentClassPracticeBeforeBinding $binding;
    final /* synthetic */ List<StepProcessSessionEntity> $listStep;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$validateContinueButton$1(List<StepProcessSessionEntity> list, FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Continuation continuation) {
        super(2, continuation);
        this.$listStep = list;
        this.$binding = fragmentClassPracticeBeforeBinding;
        this.this$0 = classPracticeBeforeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$validateContinueButton$1(this.$listStep, this.$binding, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        PrimaryButtonBinding primaryButtonBinding;
        MaterialButton root;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                for (StepProcessSessionEntity stepProcessSessionEntity : this.$listStep) {
                    if (Intrinsics.areEqual(stepProcessSessionEntity.getType(), EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_APPRENTICE, null, 1, null)) && Intrinsics.areEqual(stepProcessSessionEntity.getStatus(), "FINISH")) {
                        booleanRef.element = true;
                    }
                    if (Intrinsics.areEqual(stepProcessSessionEntity.getType(), EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR, null, 1, null)) && Intrinsics.areEqual(stepProcessSessionEntity.getStatus(), "FINISH")) {
                        booleanRef2.element = true;
                    }
                    if (Intrinsics.areEqual(stepProcessSessionEntity.getType(), EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_VEHICLE, null, 1, null)) && Intrinsics.areEqual(stepProcessSessionEntity.getStatus(), "FINISH")) {
                        booleanRef3.element = true;
                    }
                }
                FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = this.$binding;
                if (fragmentClassPracticeBeforeBinding != null && (primaryButtonBinding = fragmentClassPracticeBeforeBinding.primaryButtonClass) != null && (root = primaryButtonBinding.getRoot()) != null) {
                    root.setEnabled(booleanRef.element && booleanRef2.element && booleanRef3.element);
                }
            } catch (Exception e) {
                mutableSharedFlow = this.this$0._message;
                Status.Failure failure = new Status.Failure(new Exception(e.getMessage()));
                this.label = 1;
                if (mutableSharedFlow.emit(failure, this) == coroutine_suspended) {
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClassPracticeBeforeViewModel$validateContinueButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
