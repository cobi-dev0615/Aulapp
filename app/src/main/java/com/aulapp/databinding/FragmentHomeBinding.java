package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentHomeBinding {
    public final MaterialButton btnTodayClass;
    public final ChipGroup chipGroup;
    public final ContainerBarFiltersBinding containerButtons;
    public final LayoutEmptyItemBinding includeLayoutEmptyItem;
    private final LinearLayout rootView;
    public final RecyclerView rvClass;
    public final SwipeRefreshLayout swrHome;

    private FragmentHomeBinding(LinearLayout linearLayout, MaterialButton materialButton, ChipGroup chipGroup, ContainerBarFiltersBinding containerBarFiltersBinding, LayoutEmptyItemBinding layoutEmptyItemBinding, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = linearLayout;
        this.btnTodayClass = materialButton;
        this.chipGroup = chipGroup;
        this.containerButtons = containerBarFiltersBinding;
        this.includeLayoutEmptyItem = layoutEmptyItemBinding;
        this.rvClass = recyclerView;
        this.swrHome = swipeRefreshLayout;
    }

    public static FragmentHomeBinding bind(View view) {
        int i = R.id.btn_today_class;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_today_class);
        if (materialButton != null) {
            i = R.id.chip_group;
            ChipGroup chipGroup = (ChipGroup) ViewBindings.findChildViewById(view, R.id.chip_group);
            if (chipGroup != null) {
                i = R.id.container_buttons;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.container_buttons);
                if (findChildViewById != null) {
                    ContainerBarFiltersBinding bind = ContainerBarFiltersBinding.bind(findChildViewById);
                    i = R.id.include_layout_empty_item;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_layout_empty_item);
                    if (findChildViewById2 != null) {
                        LayoutEmptyItemBinding bind2 = LayoutEmptyItemBinding.bind(findChildViewById2);
                        i = R.id.rv_class;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_class);
                        if (recyclerView != null) {
                            i = R.id.swr_home;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.swr_home);
                            if (swipeRefreshLayout != null) {
                                return new FragmentHomeBinding((LinearLayout) view, materialButton, chipGroup, bind, bind2, recyclerView, swipeRefreshLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
