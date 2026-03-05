package co.ceduladigital.sdk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class q1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ ClassPracticeBeforeFragment c;

    public /* synthetic */ q1(FragmentActivity fragmentActivity, ClassPracticeBeforeFragment classPracticeBeforeFragment) {
        this.a = 1;
        this.b = fragmentActivity;
        this.c = classPracticeBeforeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ClassPracticeBeforeFragment this$0 = this.c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FragmentActivity fragment = this.b;
                Intrinsics.checkNotNullParameter(fragment, "$fragment");
                Context context = this$0.getContext();
                if (context != null) {
                    GpsUtil.INSTANCE.locationEnabled(context, new o1(this$0, fragment, 0));
                }
                break;
            case 1:
                FragmentActivity it = this.b;
                Intrinsics.checkNotNullParameter(it, "$it");
                ClassPracticeBeforeFragment this$02 = this.c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                GpsUtil.INSTANCE.validatePermission(it, new q1(this$02, it, 2));
                break;
            default:
                ClassPracticeBeforeFragment this$03 = this.c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                FragmentActivity it2 = this.b;
                Intrinsics.checkNotNullParameter(it2, "$it");
                Context context2 = this$03.getContext();
                if (context2 != null) {
                    GpsUtil.INSTANCE.locationEnabled(context2, new o1(this$03, it2, 0));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q1(ClassPracticeBeforeFragment classPracticeBeforeFragment, FragmentActivity fragmentActivity, int i) {
        this.a = i;
        this.c = classPracticeBeforeFragment;
        this.b = fragmentActivity;
    }
}
