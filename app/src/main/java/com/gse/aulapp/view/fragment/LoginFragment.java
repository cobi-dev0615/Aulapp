package com.gse.aulapp.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.ViewModelProvider;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.r2;
import co.ceduladigital.sdk.v6;
import co.ceduladigital.sdk.w6;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentLoginBinding;
import com.gse.aulapp.model.repository.LoginRepository;
import com.gse.aulapp.util.BuildTypeUtil;
import com.gse.aulapp.util.ButtonUtil;
import com.gse.aulapp.util.InputUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.viewmodel.LoginViewModel;
import com.gse.aulapp.viewmodel.factory.LoginViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/LoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginFragment extends Fragment {
    public LoginViewModel a;
    public FragmentLoginBinding b;

    public LoginFragment() {
        Reflection.getOrCreateKotlinClass(LoginFragment.class).getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (LoginViewModel) new ViewModelProvider(this, new LoginViewModelFactory(new LoginRepository())).get(LoginViewModel.class);
        setHasOptionsMenu(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentLoginBinding inflate = FragmentLoginBinding.inflate(inflater, viewGroup, false);
        this.b = inflate;
        Intrinsics.checkNotNull(inflate);
        RelativeLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (companion.getToken(requireContext) == null && this.b != null) {
            InputUtil.Companion companion2 = InputUtil.INSTANCE;
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            FragmentLoginBinding fragmentLoginBinding = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding);
            TextInputLayout tilTextInputUserLogin = fragmentLoginBinding.tilTextInputUserLogin;
            Intrinsics.checkNotNullExpressionValue(tilTextInputUserLogin, "tilTextInputUserLogin");
            companion2.emailTextInputLayout(requireActivity, tilTextInputUserLogin);
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            FragmentLoginBinding fragmentLoginBinding2 = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding2);
            TextInputLayout tilTextInputPasswordLogin = fragmentLoginBinding2.tilTextInputPasswordLogin;
            Intrinsics.checkNotNullExpressionValue(tilTextInputPasswordLogin, "tilTextInputPasswordLogin");
            companion2.passwordTextInputLayout(requireActivity2, tilTextInputPasswordLogin);
            ButtonUtil.Companion companion3 = ButtonUtil.INSTANCE;
            FragmentLoginBinding fragmentLoginBinding3 = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding3);
            MaterialButton root = fragmentLoginBinding3.includePrimaryButtonLogin.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            companion3.customPrimaryButton(root, getString(R.string.title_mb_login));
            FragmentLoginBinding fragmentLoginBinding4 = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding4);
            fragmentLoginBinding4.mtvVersionAppLogin.setText(BuildTypeUtil.Companion.getAppVersion$default(BuildTypeUtil.INSTANCE, false, 1, null));
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new v6(this, null));
            FragmentLoginBinding fragmentLoginBinding5 = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding5);
            fragmentLoginBinding5.mtvLinkRecoveryPasswordLogin.setOnClickListener(new k1(5));
            FragmentLoginBinding fragmentLoginBinding6 = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding6);
            fragmentLoginBinding6.includePrimaryButtonLogin.getRoot().setOnClickListener(new r2(this, 5));
            FragmentLoginBinding fragmentLoginBinding7 = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding7);
            fragmentLoginBinding7.tietTextInputUserLogin.addTextChangedListener(new w6(this, 0));
            FragmentLoginBinding fragmentLoginBinding8 = this.b;
            Intrinsics.checkNotNull(fragmentLoginBinding8);
            fragmentLoginBinding8.tietTextInputPasswordLogin.addTextChangedListener(new w6(this, 1));
        }
    }
}
