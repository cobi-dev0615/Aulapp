package com.gse.aulapp.view.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.view.LifecycleOwnerKt;
import androidx.view.ViewModelProvider;
import co.ceduladigital.sdk.c8;
import co.ceduladigital.sdk.d8;
import co.ceduladigital.sdk.u2;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentRideHistoryBinding;
import com.gse.aulapp.model.adapter.RideHistoryRecyclerAdapter;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.UIHelper;
import com.gse.aulapp.util.extension.ViewExtKt;
import com.gse.aulapp.view.fragment.RideHistoryFragment;
import com.gse.aulapp.viewmodel.RideHistoryViewModel;
import com.gse.aulapp.viewmodel.factory.RideHistoryViewModelFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/RideHistoryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRideHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryFragment.kt\ncom/gse/aulapp/view/fragment/RideHistoryFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1#2:233\n*E\n"})
/* loaded from: classes2.dex */
public final class RideHistoryFragment extends Fragment {
    public RideHistoryViewModel a;
    public FragmentRideHistoryBinding b;
    public RideHistoryRecyclerAdapter c;
    public AlertDialog d;

    public static final void b(RideHistoryFragment rideHistoryFragment, boolean z) {
        if (!z) {
            FragmentRideHistoryBinding fragmentRideHistoryBinding = rideHistoryFragment.b;
            Intrinsics.checkNotNull(fragmentRideHistoryBinding);
            fragmentRideHistoryBinding.includeLayoutEmptyItem.getRoot().setVisibility(8);
            FragmentRideHistoryBinding fragmentRideHistoryBinding2 = rideHistoryFragment.b;
            Intrinsics.checkNotNull(fragmentRideHistoryBinding2);
            fragmentRideHistoryBinding2.rvRide.setVisibility(0);
            return;
        }
        FragmentRideHistoryBinding fragmentRideHistoryBinding3 = rideHistoryFragment.b;
        Intrinsics.checkNotNull(fragmentRideHistoryBinding3);
        fragmentRideHistoryBinding3.includeLayoutEmptyItem.getRoot().setVisibility(0);
        FragmentRideHistoryBinding fragmentRideHistoryBinding4 = rideHistoryFragment.b;
        Intrinsics.checkNotNull(fragmentRideHistoryBinding4);
        fragmentRideHistoryBinding4.rvRide.setVisibility(8);
        FragmentRideHistoryBinding fragmentRideHistoryBinding5 = rideHistoryFragment.b;
        Intrinsics.checkNotNull(fragmentRideHistoryBinding5);
        TextView textView = fragmentRideHistoryBinding5.includeLayoutEmptyItem.emptyItemDescription;
        Context context = rideHistoryFragment.getContext();
        textView.setText(context != null ? context.getText(R.string.txt_ride_history_empty) : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            SessionDao SessionDao = GeneralApp.INSTANCE.getDatabase().SessionDao();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            this.a = (RideHistoryViewModel) new ViewModelProvider(this, new RideHistoryViewModelFactory(new SessionRepository(SessionDao, requireContext))).get(RideHistoryViewModel.class);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentRideHistoryBinding inflate = FragmentRideHistoryBinding.inflate(inflater, viewGroup, false);
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
        UIHelper.Companion companion = UIHelper.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        UIHelper.Companion.setterCustomToolbar$default(companion, requireActivity, false, false, getString(R.string.title_ride_history), null, null, false, false, 246, null);
        if (getArguments() != null) {
            Bundle bundle2 = requireArguments();
            Intrinsics.checkNotNullExpressionValue(bundle2, "requireArguments(...)");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
            bundle2.setClassLoader(d8.class.getClassLoader());
            if (!bundle2.containsKey("instructorID")) {
                throw new IllegalArgumentException("Required argument \"instructorID\" is missing and does not have an android:defaultValue");
            }
            String string = bundle2.getString("instructorID");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"instructorID\" is marked as non-null but was passed a null value.");
            }
            new d8(string);
        }
        FragmentRideHistoryBinding fragmentRideHistoryBinding = this.b;
        if (fragmentRideHistoryBinding != null) {
            Intrinsics.checkNotNull(fragmentRideHistoryBinding);
            fragmentRideHistoryBinding.rvRide.setHasFixedSize(true);
            FragmentRideHistoryBinding fragmentRideHistoryBinding2 = this.b;
            Intrinsics.checkNotNull(fragmentRideHistoryBinding2);
            fragmentRideHistoryBinding2.rvRide.setLayoutManager(new LinearLayoutManager(getContext()));
            this.c = new RideHistoryRecyclerAdapter(CollectionsKt.emptyList());
            RideHistoryViewModel rideHistoryViewModel = this.a;
            if (rideHistoryViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rideHistoryViewModel = null;
            }
            Context context = getContext();
            FragmentRideHistoryBinding fragmentRideHistoryBinding3 = this.b;
            Intrinsics.checkNotNull(fragmentRideHistoryBinding3);
            rideHistoryViewModel.initDate(context, fragmentRideHistoryBinding3);
            FragmentRideHistoryBinding fragmentRideHistoryBinding4 = this.b;
            Intrinsics.checkNotNull(fragmentRideHistoryBinding4);
            final int i = 0;
            fragmentRideHistoryBinding4.includeCardDate.dateLeft.setOnClickListener(new View.OnClickListener(this) { // from class: co.ceduladigital.sdk.a8
                public final /* synthetic */ RideHistoryFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            RideHistoryFragment this$0 = this.b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            RideHistoryViewModel rideHistoryViewModel2 = this$0.a;
                            if (rideHistoryViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                rideHistoryViewModel2 = null;
                            }
                            Context context2 = this$0.getContext();
                            FragmentRideHistoryBinding fragmentRideHistoryBinding5 = this$0.b;
                            Intrinsics.checkNotNull(fragmentRideHistoryBinding5);
                            rideHistoryViewModel2.previousMonth(context2, fragmentRideHistoryBinding5);
                            break;
                        default:
                            RideHistoryFragment this$02 = this.b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            RideHistoryViewModel rideHistoryViewModel3 = this$02.a;
                            if (rideHistoryViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                rideHistoryViewModel3 = null;
                            }
                            Context context3 = this$02.getContext();
                            FragmentRideHistoryBinding fragmentRideHistoryBinding6 = this$02.b;
                            Intrinsics.checkNotNull(fragmentRideHistoryBinding6);
                            rideHistoryViewModel3.nextMonth(context3, fragmentRideHistoryBinding6);
                            break;
                    }
                }
            });
            FragmentRideHistoryBinding fragmentRideHistoryBinding5 = this.b;
            Intrinsics.checkNotNull(fragmentRideHistoryBinding5);
            final int i2 = 1;
            fragmentRideHistoryBinding5.includeCardDate.dateRight.setOnClickListener(new View.OnClickListener(this) { // from class: co.ceduladigital.sdk.a8
                public final /* synthetic */ RideHistoryFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            RideHistoryFragment this$0 = this.b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            RideHistoryViewModel rideHistoryViewModel2 = this$0.a;
                            if (rideHistoryViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                rideHistoryViewModel2 = null;
                            }
                            Context context2 = this$0.getContext();
                            FragmentRideHistoryBinding fragmentRideHistoryBinding52 = this$0.b;
                            Intrinsics.checkNotNull(fragmentRideHistoryBinding52);
                            rideHistoryViewModel2.previousMonth(context2, fragmentRideHistoryBinding52);
                            break;
                        default:
                            RideHistoryFragment this$02 = this.b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            RideHistoryViewModel rideHistoryViewModel3 = this$02.a;
                            if (rideHistoryViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                rideHistoryViewModel3 = null;
                            }
                            Context context3 = this$02.getContext();
                            FragmentRideHistoryBinding fragmentRideHistoryBinding6 = this$02.b;
                            Intrinsics.checkNotNull(fragmentRideHistoryBinding6);
                            rideHistoryViewModel3.nextMonth(context3, fragmentRideHistoryBinding6);
                            break;
                    }
                }
            });
            FragmentRideHistoryBinding fragmentRideHistoryBinding6 = this.b;
            Intrinsics.checkNotNull(fragmentRideHistoryBinding6);
            ImageView actionCalendar = fragmentRideHistoryBinding6.actionCalendar;
            Intrinsics.checkNotNullExpressionValue(actionCalendar, "actionCalendar");
            ViewExtKt.setOnSingleClickListener(actionCalendar, new u2(this, 2));
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new c8(this, null));
        }
    }
}
