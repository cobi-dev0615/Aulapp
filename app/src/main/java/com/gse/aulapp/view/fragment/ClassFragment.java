package com.gse.aulapp.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.ViewModelProvider;
import co.ceduladigital.sdk.c0;
import co.ceduladigital.sdk.i0;
import co.ceduladigital.sdk.k0;
import com.gse.aulapp.databinding.FragmentClassBinding;
import com.gse.aulapp.io.ReceptionsDatabase;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.viewmodel.ClassViewModel;
import com.gse.aulapp.viewmodel.factory.ClassViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/ClassFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassFragment.kt\ncom/gse/aulapp/view/fragment/ClassFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,379:1\n360#2,7:380\n*S KotlinDebug\n*F\n+ 1 ClassFragment.kt\ncom/gse/aulapp/view/fragment/ClassFragment\n*L\n175#1:380,7\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassFragment extends Fragment {
    public final String a = Reflection.getOrCreateKotlinClass(ClassFragment.class).getSimpleName();
    public ClassViewModel b;
    public FragmentClassBinding c;

    public final void b(RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (i == -1 || findFirstVisibleItemPosition > i || i > findLastVisibleItemPosition) {
            FragmentClassBinding fragmentClassBinding = this.c;
            Intrinsics.checkNotNull(fragmentClassBinding);
            fragmentClassBinding.btnTodayClass.setVisibility(0);
        } else {
            FragmentClassBinding fragmentClassBinding2 = this.c;
            Intrinsics.checkNotNull(fragmentClassBinding2);
            fragmentClassBinding2.btnTodayClass.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ReceptionsDatabase.Companion companion = ReceptionsDatabase.INSTANCE;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        this.b = (ClassViewModel) new ViewModelProvider(this, new ClassViewModelFactory(new SessionRepository(companion.getDatabase(requireContext2).SessionDao(), requireContext))).get(ClassViewModel.class);
        setHasOptionsMenu(false);
        ClassViewModel classViewModel = this.b;
        if (classViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classViewModel = null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        classViewModel.initNfcStatus(requireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentClassBinding inflate = FragmentClassBinding.inflate(inflater, viewGroup, false);
        this.c = inflate;
        Intrinsics.checkNotNull(inflate);
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ClassViewModel classViewModel = this.b;
        if (classViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classViewModel = null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        classViewModel.disableNfc(requireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentClassBinding fragmentClassBinding = this.c;
        if (fragmentClassBinding != null) {
            Intrinsics.checkNotNull(fragmentClassBinding);
            fragmentClassBinding.rvClass.setHasFixedSize(true);
            FragmentClassBinding fragmentClassBinding2 = this.c;
            Intrinsics.checkNotNull(fragmentClassBinding2);
            fragmentClassBinding2.rvClass.setLayoutManager(new LinearLayoutManager(getContext()));
            ClassViewModel classViewModel = this.b;
            if (classViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classViewModel = null;
            }
            classViewModel.getClassDateList().observe(getViewLifecycleOwner(), new k0(new c0(this, 1)));
            FragmentClassBinding fragmentClassBinding3 = this.c;
            Intrinsics.checkNotNull(fragmentClassBinding3);
            fragmentClassBinding3.btnStart.setOnClickListener(new i0(this, 0));
            FragmentClassBinding fragmentClassBinding4 = this.c;
            Intrinsics.checkNotNull(fragmentClassBinding4);
            fragmentClassBinding4.btnStop.setOnClickListener(new i0(this, 1));
            FragmentClassBinding fragmentClassBinding5 = this.c;
            Intrinsics.checkNotNull(fragmentClassBinding5);
            fragmentClassBinding5.btnCalculate.setOnClickListener(new i0(this, 2));
            FragmentClassBinding fragmentClassBinding6 = this.c;
            Intrinsics.checkNotNull(fragmentClassBinding6);
            fragmentClassBinding6.btnCloseNfc.setOnClickListener(new i0(this, 3));
        }
    }
}
