package co.ceduladigital.sdk;

import android.text.Editable;
import android.text.TextWatcher;
import com.gse.aulapp.databinding.FragmentLoginBinding;
import com.gse.aulapp.view.fragment.LoginFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w6 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginFragment b;

    public /* synthetic */ w6(LoginFragment loginFragment, int i) {
        this.a = i;
        this.b = loginFragment;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void d(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                FragmentLoginBinding fragmentLoginBinding = this.b.b;
                Intrinsics.checkNotNull(fragmentLoginBinding);
                fragmentLoginBinding.mtvInformationLogin.setVisibility(4);
                break;
            default:
                FragmentLoginBinding fragmentLoginBinding2 = this.b.b;
                Intrinsics.checkNotNull(fragmentLoginBinding2);
                fragmentLoginBinding2.mtvInformationLogin.setVisibility(4);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }
}
