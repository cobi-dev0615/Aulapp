package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.util.Log;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.databinding.PrimaryButtonBinding;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$changeStatus$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {364, 370, 376}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$changeStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ FragmentClassPracticeBeforeBinding $binding;
    final /* synthetic */ EnumIdStepperMenu $enumIdStepperMenu;
    final /* synthetic */ boolean $isEntry;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumIdStepperMenu.values().length];
            try {
                iArr[EnumIdStepperMenu.ID_VALIDATION_APPRENTICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumIdStepperMenu.ID_VALIDATION_VEHICLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$changeStatus$1(EnumIdStepperMenu enumIdStepperMenu, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, boolean z, Activity activity, FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding, Continuation<? super ClassPracticeBeforeViewModel$changeStatus$1> continuation) {
        super(2, continuation);
        this.$enumIdStepperMenu = enumIdStepperMenu;
        this.this$0 = classPracticeBeforeViewModel;
        this.$isEntry = z;
        this.$activity = activity;
        this.$binding = fragmentClassPracticeBeforeBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$changeStatus$1(this.$enumIdStepperMenu, this.this$0, this.$isEntry, this.$activity, this.$binding, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        MutableSharedFlow mutableSharedFlow3;
        PrimaryButtonBinding primaryButtonBinding;
        MaterialButton root;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$enumIdStepperMenu.ordinal()];
            if (i2 == 1) {
                this.this$0.saveStepStatus(this.$enumIdStepperMenu, this.$isEntry);
                mutableSharedFlow = this.this$0._message;
                Status.Success success = new Status.Success(Boxing.boxBoolean(true));
                this.label = 1;
            } else if (i2 == 2) {
                this.this$0.saveStepStatus(this.$enumIdStepperMenu, this.$isEntry);
                this.this$0.validateNfcStatus(this.$activity, this.$binding, this.$isEntry);
                mutableSharedFlow2 = this.this$0._message;
                Status.Success success2 = new Status.Success(Boxing.boxBoolean(true));
                this.label = 2;
            } else if (i2 != 3) {
                str = this.this$0.TAG;
                Boxing.boxInt(Log.e(str, "changeStatus"));
            } else {
                this.this$0.saveStepStatus(this.$enumIdStepperMenu, this.$isEntry);
                FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = this.$binding;
                if (fragmentClassPracticeBeforeBinding != null && (primaryButtonBinding = fragmentClassPracticeBeforeBinding.primaryButtonClass) != null && (root = primaryButtonBinding.getRoot()) != null) {
                    root.setEnabled(true);
                }
                mutableSharedFlow3 = this.this$0._message;
                Status.Success success3 = new Status.Success(Boxing.boxBoolean(true));
                this.label = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassPracticeBeforeViewModel$changeStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
