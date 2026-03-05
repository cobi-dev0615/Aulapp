package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.converter.SessionDataConverter;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$getSessionByDB$2", f = "HomeViewModel.kt", i = {}, l = {320, 321, 331}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$getSessionByDB$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getSessionByDB$2(HomeViewModel homeViewModel, Continuation<? super HomeViewModel$getSessionByDB$2> continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$getSessionByDB$2(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r4.emit(r5, r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        if (r8.getSessionConfigList(r7) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeViewModel homeViewModel = this.this$0;
            this.label = 1;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.this$0.getIsSwipeRefresh()) {
                    this.this$0.getSwrHome().setRefreshing(false);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            List<SessionDto> listSessionDtoFromListSessionFull = SessionDataConverter.INSTANCE.getListSessionDtoFromListSessionFull((List) obj);
            singleLiveEvent = this.this$0._listConfigSession;
            List<ConfigurationSessionDto> list = (List) singleLiveEvent.getValue();
            ClassUtil.FilterType filterType = this.this$0.getDateSelect() != null ? ClassUtil.FilterType.DATE : ClassUtil.FilterType.DEFAULT;
            mutableSharedFlow = this.this$0._message;
            Status.Success success = new Status.Success(new ClassUtil().groupClassDetailsByFilterType$app_release(listSessionDtoFromListSessionFull, filterType, list));
            this.label = 3;
        }
        HomeViewModel homeViewModel2 = this.this$0;
        this.label = 2;
        obj = homeViewModel2.getSessionFromDB(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$getSessionByDB$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
