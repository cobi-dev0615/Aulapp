package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.converter.SessionDataConverter;
import com.gse.aulapp.model.data.ClassDate;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.util.ClassUtil;
import com.gse.aulapp.util.SingleLiveEvent;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$getSessionFromDBFilterChip$2", f = "HomeViewModel.kt", i = {}, l = {375, 385, 387}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$getSessionFromDBFilterChip$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getSessionFromDBFilterChip$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$getSessionFromDBFilterChip$2(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r1.emit(r2, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        if (r7 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        List list;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeViewModel homeViewModel = this.this$0;
            this.label = 1;
            obj = homeViewModel.getSessionByType(this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        List<SessionDto> listSessionDtoFromListSessionFull = SessionDataConverter.INSTANCE.getListSessionDtoFromListSessionFull((List) obj);
        singleLiveEvent = this.this$0._listConfigSession;
        List<ConfigurationSessionDto> list2 = (List) singleLiveEvent.getValue();
        ClassUtil classUtil = new ClassUtil();
        list = this.this$0.listClasType;
        List<ClassDate> groupClassDetailsByFilterType$app_release = classUtil.groupClassDetailsByFilterType$app_release(listSessionDtoFromListSessionFull, !list.isEmpty() ? ClassUtil.FilterType.CHIP : ClassUtil.FilterType.DEFAULT, list2);
        if (groupClassDetailsByFilterType$app_release.isEmpty()) {
            mutableSharedFlow = this.this$0._message;
            Status.Empty empty = Status.Empty.INSTANCE;
            this.label = 3;
        } else {
            mutableSharedFlow2 = this.this$0._message;
            Status.Success success = new Status.Success(groupClassDetailsByFilterType$app_release);
            this.label = 2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$getSessionFromDBFilterChip$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
