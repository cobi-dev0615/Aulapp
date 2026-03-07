package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$initSessionSyncPending$1", f = "HomeViewModel.kt", i = {}, l = {1117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$initSessionSyncPending$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentHomeBinding $binding;
    final /* synthetic */ Context $context;
    final /* synthetic */ Menu $item;
    final /* synthetic */ boolean $toast;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$initSessionSyncPending$1$1", f = "HomeViewModel.kt", i = {1}, l = {1118, 1119}, m = "invokeSuspend", n = {"ok"}, s = {"L$0"})
    /* renamed from: com.gse.aulapp.viewmodel.HomeViewModel$initSessionSyncPending$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentHomeBinding $binding;
        final /* synthetic */ Context $context;
        final /* synthetic */ Menu $item;
        final /* synthetic */ boolean $toast;
        Object L$0;
        int label;
        final /* synthetic */ HomeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeViewModel homeViewModel, Context context, Menu menu, FragmentHomeBinding fragmentHomeBinding, boolean z, Continuation<?> continuation) {
            super(2, continuation);
            this.this$0 = homeViewModel;
            this.$context = context;
            this.$item = menu;
            this.$binding = fragmentHomeBinding;
            this.$toast = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$context, this.$item, this.$binding, this.$toast, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
        
            if (r12 == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SessionRepository sessionRepository;
            HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository;
            Pair pair;
            MenuItem findItem;
            Drawable drawable;
            String unused;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                sessionRepository = this.this$0.sessionRepository;
                Context context = this.$context;
                this.label = 1;
                obj = sessionRepository.initAllSessionSyncPending(context, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pair = (Pair) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    findItem = this.$item.findItem(R.id.action_sync);
                    HomeViewModel homeViewModel = this.this$0;
                    Context context2 = this.$context;
                    Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    homeViewModel.onSwipeRefresh((Activity) context2, this.$binding);
                    if (((Boolean) pair.getFirst()).booleanValue()) {
                        LogSendUtil.INSTANCE.setLog(this.$context, "initSessionSyncPending response: Sincronización Exitosa", null, false);
                        unused = this.this$0.TAG;
                    }
                    if (((Boolean) pair.getFirst()).booleanValue()) {
                        drawable = ((Activity) this.$context).getResources().getDrawable(R.drawable.ic_cloud_sync_fail);
                        boolean z = this.$toast;
                        Context context3 = this.$context;
                        if (z) {
                            DialogUtil.Companion companion = DialogUtil.INSTANCE;
                            Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type android.app.Activity");
                            Activity activity = (Activity) context3;
                            String string = context3.getString(R.string.txt_detail_toast_sync_fail);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            companion.showToastAlert(activity, string, 1640);
                        }
                    } else {
                        drawable = ((Activity) this.$context).getResources().getDrawable(R.drawable.ic_cloud_green);
                    }
                    if (findItem != null) {
                        findItem.setIcon(drawable);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Pair pair2 = (Pair) obj;
            historicRecordPermissionsChangeRepository = this.this$0.sessionHistoricRecordPermissionsChangeRepository;
            Context context4 = this.$context;
            this.L$0 = pair2;
            this.label = 2;
            if (historicRecordPermissionsChangeRepository.syncHistoricPermissionChange(context4, this) != coroutine_suspended) {
                pair = pair2;
                findItem = this.$item.findItem(R.id.action_sync);
                HomeViewModel homeViewModel2 = this.this$0;
                Context context22 = this.$context;
                Intrinsics.checkNotNull(context22, "null cannot be cast to non-null type android.app.Activity");
                homeViewModel2.onSwipeRefresh((Activity) context22, this.$binding);
                if (((Boolean) pair.getFirst()).booleanValue()) {
                }
                if (((Boolean) pair.getFirst()).booleanValue()) {
                }
                if (findItem != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$initSessionSyncPending$1(HomeViewModel homeViewModel, Context context, Menu menu, FragmentHomeBinding fragmentHomeBinding, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
        this.$context = context;
        this.$item = menu;
        this.$binding = fragmentHomeBinding;
        this.$toast = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$initSessionSyncPending$1(this.this$0, this.$context, this.$item, this.$binding, this.$toast, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, this.$item, this.$binding, this.$toast, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$initSessionSyncPending$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
