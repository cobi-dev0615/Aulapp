package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.SessionResponseDto;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$saveSessionAndGetFromDB$1", f = "HomeViewModel.kt", i = {}, l = {305, 306, 313}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$saveSessionAndGetFromDB$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SessionResponseDto $sessionInstructorObjectResponseList;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$saveSessionAndGetFromDB$1$1", f = "HomeViewModel.kt", i = {}, l = {307, 310}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.HomeViewModel$saveSessionAndGetFromDB$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionResponseDto $sessionInstructorObjectResponseList;
        int label;
        final /* synthetic */ HomeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeViewModel homeViewModel, SessionResponseDto sessionResponseDto, Continuation<?> continuation) {
            super(2, continuation);
            this.this$0 = homeViewModel;
            this.$sessionInstructorObjectResponseList = sessionResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$sessionInstructorObjectResponseList, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object saveSessionFull;
            Object sessionByDB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HomeViewModel homeViewModel = this.this$0;
                SessionResponseDto sessionResponseDto = this.$sessionInstructorObjectResponseList;
                this.label = 1;
                saveSessionFull = homeViewModel.saveSessionFull(sessionResponseDto, this);
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
            HomeViewModel homeViewModel2 = this.this$0;
            this.label = 2;
            sessionByDB = homeViewModel2.getSessionByDB(this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$saveSessionAndGetFromDB$1(HomeViewModel homeViewModel, SessionResponseDto sessionResponseDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
        this.$sessionInstructorObjectResponseList = sessionResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$saveSessionAndGetFromDB$1(this.this$0, this.$sessionInstructorObjectResponseList, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r1.emit(r2, r7) != r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            mutableSharedFlow = this.this$0._message;
            Status.Failure failure = new Status.Failure(new Exception(e.getMessage()));
            this.label = 3;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.getIsSwipeRefresh()) {
                mutableSharedFlow2 = this.this$0._message;
                Status.Loading loading = new Status.Loading(false, 1, null);
                this.label = 1;
                if (mutableSharedFlow2.emit(loading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$sessionInstructorObjectResponseList, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$saveSessionAndGetFromDB$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
