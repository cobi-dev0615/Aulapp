package co.ceduladigital.sdk;

import androidx.fragment.app.Fragment;
import androidx.activity.OnBackPressedCallback;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.view.fragment.HomeFragment;

/* loaded from: classes2.dex */
public final class e2 extends OnBackPressedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i, Fragment fragment) {
        super(true);
        this.a = i;
        this.b = fragment;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        switch (this.a) {
            case 0:
                ((ClassPracticeBeforeFragment) this.b).f();
                break;
            default:
                ((HomeFragment) this.b).requireActivity().finish();
                break;
        }
    }
}
