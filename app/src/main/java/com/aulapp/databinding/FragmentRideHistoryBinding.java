package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentRideHistoryBinding {
    public final ImageView actionCalendar;
    public final CardDateBinding includeCardDate;
    public final LayoutEmptyItemBinding includeLayoutEmptyItem;
    private final ConstraintLayout rootView;
    public final RecyclerView rvRide;

    private FragmentRideHistoryBinding(ConstraintLayout constraintLayout, ImageView imageView, CardDateBinding cardDateBinding, LayoutEmptyItemBinding layoutEmptyItemBinding, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.actionCalendar = imageView;
        this.includeCardDate = cardDateBinding;
        this.includeLayoutEmptyItem = layoutEmptyItemBinding;
        this.rvRide = recyclerView;
    }

    public static FragmentRideHistoryBinding bind(View view) {
        int i = R.id.action_calendar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.action_calendar);
        if (imageView != null) {
            i = R.id.include_card_date;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_card_date);
            if (findChildViewById != null) {
                CardDateBinding bind = CardDateBinding.bind(findChildViewById);
                i = R.id.include_layout_empty_item;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_layout_empty_item);
                if (findChildViewById2 != null) {
                    LayoutEmptyItemBinding bind2 = LayoutEmptyItemBinding.bind(findChildViewById2);
                    i = R.id.rv_ride;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_ride);
                    if (recyclerView != null) {
                        return new FragmentRideHistoryBinding((ConstraintLayout) view, imageView, bind, bind2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentRideHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ride_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
