package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.view.Menu;
import androidx.navigation.ActionOnlyNavDirections;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.ActivityUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.TemplatesUtil;
import com.gse.aulapp.view.activity.MainActivity;
import com.karumi.dexter.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$onClickLogOut$1", f = "HomeViewModel.kt", i = {}, l = {641, 644}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$onClickLogOut$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ FragmentHomeBinding $binding;
    final /* synthetic */ Menu $item;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onClickLogOut$1(HomeViewModel homeViewModel, Activity activity, FragmentHomeBinding fragmentHomeBinding, Menu menu, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
        this.$activity = activity;
        this.$binding = fragmentHomeBinding;
        this.$item = menu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(HomeViewModel homeViewModel, Activity activity, FragmentHomeBinding fragmentHomeBinding, Menu menu) {
        homeViewModel.validateConnection(activity, new d(homeViewModel, activity, fragmentHomeBinding, menu, 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(HomeViewModel homeViewModel, Activity activity, FragmentHomeBinding fragmentHomeBinding, Menu menu) {
        homeViewModel.initSessionSyncPending(activity, fragmentHomeBinding, menu, true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$onClickLogOut$1(this.this$0, this.$activity, this.$binding, this.$item, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r10.deleteLogOutSession(r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if (r10 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        SessionRepository sessionRepository2;
        Map<String, String> buildCallTypeParametersMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sessionRepository = this.this$0.sessionRepository;
            this.label = 1;
            obj = sessionRepository.getSessionsIsPending(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DialogUtil.INSTANCE.showDialogProgressGlobal(this.$activity, true, true, true);
                buildCallTypeParametersMap = this.this$0.buildCallTypeParametersMap();
                ActivityUtil.INSTANCE.navigateToActivity(this.$activity, MainActivity.class, true, buildCallTypeParametersMap);
                new ActionOnlyNavDirections(R.id.action_homeFragment_to_firstLoginFragment);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Number) obj).longValue() != 0) {
            DialogNormalUtil.Companion companion = DialogNormalUtil.INSTANCE;
            Activity activity = this.$activity;
            DialogNormalUtil.Companion.showDialog$app_release$default(companion, activity, EnumDialogType.IS_PENDING_SYNC, new d(this.this$0, activity, this.$binding, this.$item, 0), null, 8, null);
            return Unit.INSTANCE;
        }
        TemplatesUtil.INSTANCE.removeTemplates(this.$activity);
        sessionRepository2 = this.this$0.sessionRepository;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$onClickLogOut$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
