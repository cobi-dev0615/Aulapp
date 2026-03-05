package com.gse.aulapp.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.ViewModelProvider;
import co.ceduladigital.sdk.r2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentPasswordRecoverBinding;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.util.BuildTypeUtil;
import com.gse.aulapp.util.ButtonUtil;
import com.gse.aulapp.util.InputUtil;
import com.gse.aulapp.viewmodel.PasswordRecoverViewModel;
import com.gse.aulapp.viewmodel.factory.PasswordRecoveryViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/PasswordRecoverFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasswordRecoverFragment extends Fragment {
    public PasswordRecoverViewModel a;
    public FragmentPasswordRecoverBinding b;

    public PasswordRecoverFragment() {
        Reflection.getOrCreateKotlinClass(PasswordRecoverFragment.class).getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (PasswordRecoverViewModel) new ViewModelProvider(this, new PasswordRecoveryViewModelFactory(new PasswordRecoveryRepository())).get(PasswordRecoverViewModel.class);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentPasswordRecoverBinding inflate = FragmentPasswordRecoverBinding.inflate(inflater, viewGroup, false);
        this.b = inflate;
        Intrinsics.checkNotNull(inflate);
        return inflate.getRoot();
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
        if (this.b != null) {
            InputUtil.Companion companion = InputUtil.INSTANCE;
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            FragmentPasswordRecoverBinding fragmentPasswordRecoverBinding = this.b;
            Intrinsics.checkNotNull(fragmentPasswordRecoverBinding);
            TextInputLayout tilTextInputUserRecovery = fragmentPasswordRecoverBinding.tilTextInputUserRecovery;
            Intrinsics.checkNotNullExpressionValue(tilTextInputUserRecovery, "tilTextInputUserRecovery");
            companion.emailTextInputLayout(requireActivity, tilTextInputUserRecovery);
            ButtonUtil.Companion companion2 = ButtonUtil.INSTANCE;
            FragmentPasswordRecoverBinding fragmentPasswordRecoverBinding2 = this.b;
            Intrinsics.checkNotNull(fragmentPasswordRecoverBinding2);
            MaterialButton root = fragmentPasswordRecoverBinding2.includePrimaryButtonRecovery.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            companion2.customPrimaryButton(root, getString(R.string.title_mb_login));
            FragmentPasswordRecoverBinding fragmentPasswordRecoverBinding3 = this.b;
            Intrinsics.checkNotNull(fragmentPasswordRecoverBinding3);
            fragmentPasswordRecoverBinding3.mtvVersionAppRecovery.setText(BuildTypeUtil.Companion.getAppVersion$default(BuildTypeUtil.INSTANCE, false, 1, null));
            FragmentPasswordRecoverBinding fragmentPasswordRecoverBinding4 = this.b;
            Intrinsics.checkNotNull(fragmentPasswordRecoverBinding4);
            fragmentPasswordRecoverBinding4.includePrimaryButtonRecovery.getRoot().setOnClickListener(new r2(this, 8));
        }
    }
}
