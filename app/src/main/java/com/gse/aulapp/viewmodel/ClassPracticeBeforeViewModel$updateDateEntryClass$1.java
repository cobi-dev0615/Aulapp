package com.gse.aulapp.viewmodel;

import android.util.Log;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.DateUtil;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$updateDateEntryClass$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {920, 925}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$updateDateEntryClass$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionID;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$updateDateEntryClass$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$sessionID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$updateDateEntryClass$1(this.this$0, this.$sessionID, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        SessionRepository sessionRepository;
        Long dateLong;
        SessionRepository sessionRepository2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            str = this.this$0.TAG;
            Boxing.boxInt(Log.e(str, "updateDateEntryClas: " + e.getMessage()));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sessionRepository = this.this$0.repository;
            String str2 = this.$sessionID;
            this.label = 1;
            obj = sessionRepository.getStartEntryClass(str2, this);
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
        if (((Long) obj) == null && (dateLong = DateUtil.INSTANCE.getDateLong()) != null) {
            ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
            String str3 = this.$sessionID;
            long longValue = dateLong.longValue();
            sessionRepository2 = classPracticeBeforeViewModel.repository;
            this.label = 2;
            obj = sessionRepository2.updateDateEntryClass(longValue, str3, this);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClassPracticeBeforeViewModel$updateDateEntryClass$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
