package co.ceduladigital.sdk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.databinding.FragmentFirstLoginBinding;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.util.LoadConfigurationUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.karumi.dexter.BuildConfig;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class z4 implements FlowCollector {
    public final /* synthetic */ FirstLoginFragment a;

    public z4(FirstLoginFragment firstLoginFragment) {
        this.a = firstLoginFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Status status = (Status) obj;
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
            companion.saveTokenTemporal(firstLoginFragment.requireContext(), loginObject.getToken());
            Context requireContext = firstLoginFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            companion.saveEmail(requireContext, loginObject.getEmail());
            companion.saveDocumentNumber(firstLoginFragment.requireContext(), loginObject.getDocumentNumber());
            LoadConfigurationUtil.Companion companion2 = LoadConfigurationUtil.INSTANCE;
            FragmentActivity requireActivity = firstLoginFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            companion2.saveParameterListOnPreference(requireActivity);
            FirstLoginFragment.e(firstLoginFragment, loginObject);
        } else if (status instanceof Status.Failure) {
            FragmentFirstLoginBinding fragmentFirstLoginBinding = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding);
            fragmentFirstLoginBinding.constraintMenuCea.setVisibility(8);
            FragmentFirstLoginBinding fragmentFirstLoginBinding2 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
            fragmentFirstLoginBinding2.constraintMenuPassword.setVisibility(0);
            FragmentFirstLoginBinding fragmentFirstLoginBinding3 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
            fragmentFirstLoginBinding3.llRecoveryLogin.setVisibility(0);
            FragmentFirstLoginBinding fragmentFirstLoginBinding4 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding4);
            fragmentFirstLoginBinding4.includeDropdownCea.actv.setText(BuildConfig.FLAVOR);
            firstLoginFragment.c = BuildConfig.FLAVOR;
            firstLoginFragment.g = CollectionsKt.emptyList();
            FirstLoginFragment.d(firstLoginFragment);
        } else if (status instanceof Status.Empty) {
            FirstLoginFragment.d(firstLoginFragment);
        } else {
            firstLoginFragment.g(false);
        }
        return Unit.INSTANCE;
    }
}
