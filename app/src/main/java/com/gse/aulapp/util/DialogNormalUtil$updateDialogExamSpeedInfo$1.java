package com.gse.aulapp.util;

import com.gse.aulapp.databinding.DialogExamInfoLayoutBinding;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.util.DataClassUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
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
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.DialogNormalUtil$updateDialogExamSpeedInfo$1", f = "DialogNormalUtil.kt", i = {0, 1}, l = {485, 491}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class DialogNormalUtil$updateDialogExamSpeedInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ClassInCourseViewModel $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogNormalUtil$updateDialogExamSpeedInfo$1(ClassInCourseViewModel classInCourseViewModel, Continuation<? super DialogNormalUtil$updateDialogExamSpeedInfo$1> continuation) {
        super(2, continuation);
        this.$viewModel = classInCourseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogNormalUtil$updateDialogExamSpeedInfo$1 dialogNormalUtil$updateDialogExamSpeedInfo$1 = new DialogNormalUtil$updateDialogExamSpeedInfo$1(this.$viewModel, continuation);
        dialogNormalUtil$updateDialogExamSpeedInfo$1.L$0 = obj;
        return dialogNormalUtil$updateDialogExamSpeedInfo$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        r8.L$0 = r9;
        r8.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(10000, r8) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r5.updateClassValues(r1, r6, r7, r8) != r0) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005d -> B:6:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0071 -> B:6:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:6:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0082 -> B:6:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:6:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        String id;
        DialogNormalUtil.Companion companion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i == 1) {
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            ClassInCourseViewModel classInCourseViewModel = this.$viewModel;
            if (classInCourseViewModel != null) {
                SessionDto sessionReceived = classInCourseViewModel.getSessionReceived();
                if (sessionReceived != null) {
                    id = sessionReceived.getId();
                    if (id != null) {
                        companion = DialogNormalUtil.INSTANCE;
                        if (companion.getBindingDialogExamInfo() != null) {
                            DataClassUtil.Companion companion2 = DataClassUtil.INSTANCE;
                            DialogExamInfoLayoutBinding bindingDialogExamInfo = companion.getBindingDialogExamInfo();
                            Intrinsics.checkNotNull(bindingDialogExamInfo);
                            GpsRepository gpsRepository = this.$viewModel.getGpsRepository();
                            SessionDto sessionReceived2 = this.$viewModel.getSessionReceived();
                            Intrinsics.checkNotNull(sessionReceived2);
                            String id2 = sessionReceived2.getId();
                            this.L$0 = coroutineScope;
                            this.label = 2;
                        }
                    }
                } else if (0 != 0 && id.length() != 0) {
                    companion = DialogNormalUtil.INSTANCE;
                    if (companion.getBindingDialogExamInfo() != null && this.$viewModel.getGpsRepository() != null) {
                        DataClassUtil.Companion companion22 = DataClassUtil.INSTANCE;
                        DialogExamInfoLayoutBinding bindingDialogExamInfo2 = companion.getBindingDialogExamInfo();
                        Intrinsics.checkNotNull(bindingDialogExamInfo2);
                        GpsRepository gpsRepository2 = this.$viewModel.getGpsRepository();
                        SessionDto sessionReceived22 = this.$viewModel.getSessionReceived();
                        Intrinsics.checkNotNull(sessionReceived22);
                        String id22 = sessionReceived22.getId();
                        this.L$0 = coroutineScope;
                        this.label = 2;
                    }
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope3;
        }
        while (true) {
            DialogNormalUtil.Companion companion3 = DialogNormalUtil.INSTANCE;
            if (!companion3.getDialogExamInfoIsShowing().getValue().booleanValue()) {
                return Unit.INSTANCE;
            }
            if (companion3.getDialogExamInfo() != null && companion3.getBindingDialogExamInfo() != null) {
                break;
            }
            CoroutineScopeKt.cancel(coroutineScope);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogNormalUtil$updateDialogExamSpeedInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
