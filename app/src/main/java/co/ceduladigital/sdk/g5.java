package co.ceduladigital.sdk;

import android.content.Context;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
@SuppressWarnings({"rawtypes", "unchecked"})
public final class g5 implements FlowCollector<Status> {
    public final /* synthetic */ FirstLoginFragment a;

    public g5(FirstLoginFragment firstLoginFragment) {
        this.a = firstLoginFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Status status, Continuation continuation) {
        f5 f5Var;
        int i;
        g5 g5Var;
        if (continuation instanceof f5) {
            f5Var = (f5) continuation;
            int i2 = f5Var.d;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                f5Var.d = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = f5Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = f5Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean z = status instanceof Status.Loading;
                    FirstLoginFragment firstLoginFragment = this.a;
                    if (z) {
                        firstLoginFragment.g(true);
                    } else if (status instanceof Status.Success) {
                        firstLoginFragment.g(false);
                        Object data = ((Status.Success) status).getData();
                        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.gse.aulapp.model.dto.LoginObject");
                        LoginObject loginObject = (LoginObject) data;
                        firstLoginFragment.h = loginObject;
                        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
                        Context requireContext = firstLoginFragment.requireContext();
                        LoginObject loginObject2 = firstLoginFragment.h;
                        companion.saveTokenTemporal(requireContext, loginObject2 != null ? loginObject2.getToken() : null);
                        Context requireContext2 = firstLoginFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                        LoginObject loginObject3 = firstLoginFragment.h;
                        companion.saveEmail(requireContext2, loginObject3 != null ? loginObject3.getEmail() : null);
                        FirstLoginFragment.e(firstLoginFragment, loginObject);
                    } else if (status instanceof Status.Failure) {
                        String valueOf = String.valueOf(((Status.Failure) status).getE().getMessage());
                        f5Var.a = this;
                        f5Var.d = 1;
                        if (FirstLoginFragment.c(firstLoginFragment, valueOf, f5Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        g5Var = this;
                    } else if (!(status instanceof Status.Empty)) {
                        firstLoginFragment.g(false);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g5Var = f5Var.a;
                ResultKt.throwOnFailure(obj);
                FirstLoginFragment.d(g5Var.a);
                return Unit.INSTANCE;
            }
        }
        f5Var = new f5(this, continuation);
        Object obj2 = f5Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = f5Var.d;
        if (i != 0) {
        }
        FirstLoginFragment.d(g5Var.a);
        return Unit.INSTANCE;
    }
}
