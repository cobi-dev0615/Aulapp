package com.gse.aulapp.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.view.LifecycleOwnerKt;
import androidx.view.ViewModelProvider;
import co.ceduladigital.sdk.o6;
import co.ceduladigital.sdk.p6;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentHoursPerformedBinding;
import com.gse.aulapp.model.adapter.HoursPerformedRecyclerAdapter;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.UIHelper;
import com.gse.aulapp.viewmodel.HoursPerformedViewModel;
import com.gse.aulapp.viewmodel.factory.HoursPerformedViewModelFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/HoursPerformedFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHoursPerformedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoursPerformedFragment.kt\ncom/gse/aulapp/view/fragment/HoursPerformedFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
/* loaded from: classes2.dex */
public final class HoursPerformedFragment extends Fragment {
    public FragmentHoursPerformedBinding a;
    public HoursPerformedViewModel b;
    public HoursPerformedRecyclerAdapter c;

    public static final void b(HoursPerformedFragment hoursPerformedFragment, boolean z) {
        if (!z) {
            FragmentHoursPerformedBinding fragmentHoursPerformedBinding = hoursPerformedFragment.a;
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding);
            fragmentHoursPerformedBinding.includeLayoutEmptyItem.getRoot().setVisibility(8);
            FragmentHoursPerformedBinding fragmentHoursPerformedBinding2 = hoursPerformedFragment.a;
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding2);
            fragmentHoursPerformedBinding2.cvContainerFooter.setVisibility(0);
            FragmentHoursPerformedBinding fragmentHoursPerformedBinding3 = hoursPerformedFragment.a;
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding3);
            fragmentHoursPerformedBinding3.rvHoursPerformed.setVisibility(0);
            return;
        }
        FragmentHoursPerformedBinding fragmentHoursPerformedBinding4 = hoursPerformedFragment.a;
        Intrinsics.checkNotNull(fragmentHoursPerformedBinding4);
        fragmentHoursPerformedBinding4.includeLayoutEmptyItem.getRoot().setVisibility(0);
        FragmentHoursPerformedBinding fragmentHoursPerformedBinding5 = hoursPerformedFragment.a;
        Intrinsics.checkNotNull(fragmentHoursPerformedBinding5);
        fragmentHoursPerformedBinding5.cvContainerFooter.setVisibility(8);
        FragmentHoursPerformedBinding fragmentHoursPerformedBinding6 = hoursPerformedFragment.a;
        Intrinsics.checkNotNull(fragmentHoursPerformedBinding6);
        fragmentHoursPerformedBinding6.rvHoursPerformed.setVisibility(8);
        FragmentHoursPerformedBinding fragmentHoursPerformedBinding7 = hoursPerformedFragment.a;
        Intrinsics.checkNotNull(fragmentHoursPerformedBinding7);
        TextView textView = fragmentHoursPerformedBinding7.includeLayoutEmptyItem.emptyItemDescription;
        Context context = hoursPerformedFragment.getContext();
        textView.setText(context != null ? context.getText(R.string.txt_hours_performed_empty) : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            SessionDao SessionDao = GeneralApp.INSTANCE.getDatabase().SessionDao();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            this.b = (HoursPerformedViewModel) new ViewModelProvider(this, new HoursPerformedViewModelFactory(new SessionRepository(SessionDao, requireContext))).get(HoursPerformedViewModel.class);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentHoursPerformedBinding inflate = FragmentHoursPerformedBinding.inflate(inflater, viewGroup, false);
        this.a = inflate;
        Intrinsics.checkNotNull(inflate);
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        UIHelper.Companion companion = UIHelper.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        UIHelper.Companion.setterCustomToolbar$default(companion, requireActivity, false, false, getString(R.string.txt_button_drawer_hour), null, null, false, false, 246, null);
        if (getArguments() != null) {
            Bundle bundle2 = requireArguments();
            Intrinsics.checkNotNullExpressionValue(bundle2, "requireArguments(...)");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
            bundle2.setClassLoader(p6.class.getClassLoader());
            if (!bundle2.containsKey("instructorID")) {
                throw new IllegalArgumentException("Required argument \"instructorID\" is missing and does not have an android:defaultValue");
            }
            String string = bundle2.getString("instructorID");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"instructorID\" is marked as non-null but was passed a null value.");
            }
            new p6(string);
        }
        FragmentHoursPerformedBinding fragmentHoursPerformedBinding = this.a;
        if (fragmentHoursPerformedBinding != null) {
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding);
            fragmentHoursPerformedBinding.rvHoursPerformed.setHasFixedSize(true);
            FragmentHoursPerformedBinding fragmentHoursPerformedBinding2 = this.a;
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding2);
            fragmentHoursPerformedBinding2.rvHoursPerformed.setLayoutManager(new LinearLayoutManager(getContext()));
            FragmentHoursPerformedBinding fragmentHoursPerformedBinding3 = this.a;
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding3);
            fragmentHoursPerformedBinding3.includeCardDate.dateLeft.setVisibility(8);
            FragmentHoursPerformedBinding fragmentHoursPerformedBinding4 = this.a;
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding4);
            fragmentHoursPerformedBinding4.includeCardDate.dateRight.setVisibility(8);
            this.c = new HoursPerformedRecyclerAdapter(CollectionsKt.emptyList());
            HoursPerformedViewModel hoursPerformedViewModel = this.b;
            if (hoursPerformedViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                hoursPerformedViewModel = null;
            }
            FragmentHoursPerformedBinding fragmentHoursPerformedBinding5 = this.a;
            Intrinsics.checkNotNull(fragmentHoursPerformedBinding5);
            hoursPerformedViewModel.initDate(fragmentHoursPerformedBinding5);
            HoursPerformedViewModel hoursPerformedViewModel2 = this.b;
            if (hoursPerformedViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                hoursPerformedViewModel2 = null;
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            HoursPerformedViewModel hoursPerformedViewModel3 = this.b;
            if (hoursPerformedViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                hoursPerformedViewModel3 = null;
            }
            hoursPerformedViewModel2.getHoursPerformedApi(requireContext, hoursPerformedViewModel3.getHoursScheduledRequest());
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new o6(this, null));
        }
    }
}
