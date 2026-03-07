package com.gse.aulapp.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel", f = "HomeViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7}, l = {430, 431, 443, 444, 452, 461, 468, 479, 499, 502}, m = "saveSessionFull", n = {"this", "sessionResponseDto", "startEntryClass", "endEntryClass", "this", "sessionResponseDto", "startEntryClass", "endEntryClass", "listIdPendingSyncDB", "this", "sessionResponseDto", "startEntryClass", "endEntryClass", "listIdPendingSyncDB", "listIdDelete", "obj", "it", "this", "sessionResponseDto", "startEntryClass", "endEntryClass", "listIdPendingSyncDB", "listIdDelete", "obj", "it", "this", "sessionResponseDto", "startEntryClass", "endEntryClass", "listIdPendingSyncDB", "listIdDelete", "obj", "it", "vehicleID", "this", "sessionResponseDto", "startEntryClass", "endEntryClass", "listIdPendingSyncDB", "listIdDelete", "obj", "it", "vehicleID", "lessonId", "this", "sessionResponseDto", "startEntryClass", "endEntryClass", "listIdPendingSyncDB", "listIdDelete", "obj", "it", "vehicleID", "classRoomId", "lessonId", "this", "sessionResponseDto", "startEntryClass", "endEntryClass", "listIdPendingSyncDB", "listIdDelete", "obj"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$9", "L$10", "L$11", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$9", "L$10", "L$11", "L$12", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7"})
/* loaded from: classes2.dex */
public final class HomeViewModel$saveSessionFull$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$saveSessionFull$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object saveSessionFull;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        saveSessionFull = this.this$0.saveSessionFull(null, this);
        return saveSessionFull;
    }
}
