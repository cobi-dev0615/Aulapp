package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemHoursPerformedCardBinding {
    public final ItemHoursPerformedCardDetailBinding includeHoursPerformedCardDetail;
    private final ConstraintLayout rootView;

    private ItemHoursPerformedCardBinding(ConstraintLayout constraintLayout, ItemHoursPerformedCardDetailBinding itemHoursPerformedCardDetailBinding) {
        this.rootView = constraintLayout;
        this.includeHoursPerformedCardDetail = itemHoursPerformedCardDetailBinding;
    }

    public static ItemHoursPerformedCardBinding bind(View view) {
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_hours_performed_card_detail);
        if (findChildViewById == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.include_hours_performed_card_detail)));
        }
        return new ItemHoursPerformedCardBinding((ConstraintLayout) view, ItemHoursPerformedCardDetailBinding.bind(findChildViewById));
    }

    public static ItemHoursPerformedCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_hours_performed_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
