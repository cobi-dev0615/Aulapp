package com.gse.aulapp.view.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewModelProvider;
import co.ceduladigital.sdk.a6;
import co.ceduladigital.sdk.c0;
import co.ceduladigital.sdk.e2;
import co.ceduladigital.sdk.f6;
import co.ceduladigital.sdk.j3;
import co.ceduladigital.sdk.r2;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.UIHelper;
import com.gse.aulapp.util.extension.ViewExtKt;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.gse.aulapp.viewmodel.factory.HomeViewModelFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/gse/aulapp/view/fragment/HomeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"})
/* loaded from: classes2.dex */
public final class HomeFragment extends Fragment {
    public HomeViewModel a;
    public ClassDateRecyclerAdapter b;
    public FragmentHomeBinding c;
    public Menu d;
    public e2 e;
    public AlertDialog f;
    public boolean g;

    public HomeFragment() {
        Reflection.getOrCreateKotlinClass(HomeFragment.class).getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            GeneralApp.Companion companion = GeneralApp.INSTANCE;
            SessionDao SessionDao = companion.getDatabase().SessionDao();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            this.a = (HomeViewModel) new ViewModelProvider(this, new HomeViewModelFactory(new SessionRepository(SessionDao, requireContext), new HistoricRecordPermissionsChangeRepository(companion.getDatabase().HistoricRecordPermissionsChangeDao()))).get(HomeViewModel.class);
        } catch (Exception e) {
            e.getMessage();
        }
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_instructor_trainee_query, menu);
        HomeViewModel homeViewModel = this.a;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.setMenu(menu);
        this.d = menu;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentHomeBinding inflate = FragmentHomeBinding.inflate(inflater, viewGroup, false);
        this.c = inflate;
        Intrinsics.checkNotNull(inflate);
        LinearLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backCallback");
        }
        e2 e2Var = this.e;
        if (e2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backCallback");
            e2Var = null;
        }
        e2Var.remove();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onOptionsItemSelected(item);
        int itemId = item.getItemId();
        HomeViewModel homeViewModel = null;
        if (itemId != R.id.action_logout) {
            if (itemId != R.id.action_sync) {
                return super.onOptionsItemSelected(item);
            }
            HomeViewModel homeViewModel2 = this.a;
            if (homeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel2;
            }
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            homeViewModel.validateConnection(requireActivity, new a6(this, 2));
            return true;
        }
        if (getContext() != null) {
            HomeViewModel homeViewModel3 = this.a;
            if (homeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel3;
            }
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            FragmentHomeBinding fragmentHomeBinding = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding);
            Menu menu = this.d;
            Intrinsics.checkNotNull(menu);
            homeViewModel.showDialogLogOut(requireActivity2, fragmentHomeBinding, menu);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Dialog dialogLoading;
        super.onResume();
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        Dialog dialogLoading2 = companion.getDialogLoading();
        if (dialogLoading2 != null && dialogLoading2.isShowing() && (dialogLoading = companion.getDialogLoading()) != null) {
            dialogLoading.cancel();
        }
        UIHelper.Companion companion2 = UIHelper.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        UIHelper.Companion.setterCustomToolbar$default(companion2, requireActivity, false, true, null, null, Integer.valueOf(R.drawable.ic_drawer_menu), false, false, 154, null);
        Observer<? super Menu> observer = new Observer() { // from class: co.ceduladigital.sdk.b6
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Context context;
                Menu newMenu = (Menu) obj;
                HomeFragment this$0 = HomeFragment.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(newMenu, "newMenu");
                if (!NetworkUtil.INSTANCE.isNetworkAvailable(this$0.getActivity()) || (context = this$0.getContext()) == null) {
                    return;
                }
                HomeViewModel homeViewModel = this$0.a;
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel = null;
                }
                FragmentHomeBinding fragmentHomeBinding = this$0.c;
                Intrinsics.checkNotNull(fragmentHomeBinding);
                homeViewModel.initSessionSyncPending(context, fragmentHomeBinding, newMenu, false);
            }
        };
        HomeViewModel homeViewModel = this.a;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.getMenuLiveData().observe(this, observer);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentHomeBinding fragmentHomeBinding = this.c;
        if (fragmentHomeBinding != null) {
            Intrinsics.checkNotNull(fragmentHomeBinding);
            fragmentHomeBinding.btnTodayClass.setVisibility(8);
            HomeViewModel homeViewModel = this.a;
            e2 e2Var = null;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel = null;
            }
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            homeViewModel.validateNetwork(requireActivity);
            HomeViewModel homeViewModel2 = this.a;
            if (homeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel2 = null;
            }
            homeViewModel2.set_action(3);
            HomeViewModel homeViewModel3 = this.a;
            if (homeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel3 = null;
            }
            FragmentHomeBinding fragmentHomeBinding2 = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding2);
            homeViewModel3.setSwrHome(fragmentHomeBinding2.swrHome);
            FragmentHomeBinding fragmentHomeBinding3 = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding3);
            fragmentHomeBinding3.rvClass.setHasFixedSize(true);
            FragmentHomeBinding fragmentHomeBinding4 = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding4);
            fragmentHomeBinding4.rvClass.setLayoutManager(new LinearLayoutManager(getContext()));
            this.b = new ClassDateRecyclerAdapter(CollectionsKt.emptyList());
            HomeViewModel homeViewModel4 = this.a;
            if (homeViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel4 = null;
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            FragmentHomeBinding fragmentHomeBinding5 = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding5);
            homeViewModel4.buildChips(requireContext, fragmentHomeBinding5);
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new f6(this, null));
            FragmentHomeBinding fragmentHomeBinding6 = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding6);
            fragmentHomeBinding6.containerButtons.actionFilter.setOnClickListener(new r2(this, 3));
            ClassDateRecyclerAdapter classDateRecyclerAdapter = this.b;
            if (classDateRecyclerAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("classRecyclerAdapter");
                classDateRecyclerAdapter = null;
            }
            classDateRecyclerAdapter.setOnItemClickListenerClass(new c0(this, 6));
            FragmentHomeBinding fragmentHomeBinding7 = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding7);
            ImageView actionCalendar = fragmentHomeBinding7.containerButtons.actionCalendar;
            Intrinsics.checkNotNullExpressionValue(actionCalendar, "actionCalendar");
            ViewExtKt.setOnSingleClickListener(actionCalendar, new a6(this, 0));
            FragmentHomeBinding fragmentHomeBinding8 = this.c;
            Intrinsics.checkNotNull(fragmentHomeBinding8);
            fragmentHomeBinding8.swrHome.setOnRefreshListener(new j3(this, 8));
            this.e = new e2(1, this);
            OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            e2 e2Var2 = this.e;
            if (e2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backCallback");
            } else {
                e2Var = e2Var2;
            }
            onBackPressedDispatcher.addCallback(viewLifecycleOwner2, e2Var);
        }
    }
}
