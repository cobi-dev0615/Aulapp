package co.ceduladigital.sdk;

import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.ValidationFlowManager;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class r4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirstLoginFragment b;

    public /* synthetic */ r4(FirstLoginFragment firstLoginFragment, int i) {
        this.a = i;
        this.b = firstLoginFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                FirstLoginFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.i = null;
                PreferenceUtil.INSTANCE.clearTokenTemporal(this$0.requireContext());
                this$0.g(false);
                break;
            default:
                FirstLoginFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ValidationFlowManager validationFlowManager = this$02.i;
                if (validationFlowManager != null) {
                    validationFlowManager.moveToNextValidation();
                }
                this$02.k();
                break;
        }
        return Unit.INSTANCE;
    }
}
