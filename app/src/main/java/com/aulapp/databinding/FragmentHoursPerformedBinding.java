package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentHoursPerformedBinding {
    public final MaterialCardView cvContainerFooter;
    public final TextView footer;
    public final CardDateBinding includeCardDate;
    public final LayoutEmptyItemBinding includeLayoutEmptyItem;
    private final ConstraintLayout rootView;
    public final RecyclerView rvHoursPerformed;

    private FragmentHoursPerformedBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, TextView textView, CardDateBinding cardDateBinding, LayoutEmptyItemBinding layoutEmptyItemBinding, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.cvContainerFooter = materialCardView;
        this.footer = textView;
        this.includeCardDate = cardDateBinding;
        this.includeLayoutEmptyItem = layoutEmptyItemBinding;
        this.rvHoursPerformed = recyclerView;
    }

    public static FragmentHoursPerformedBinding bind(View view) {
        int i = R.id.cv_container_footer;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cv_container_footer);
        if (materialCardView != null) {
            i = R.id.footer;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.footer);
            if (textView != null) {
                i = R.id.include_card_date;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_card_date);
                if (findChildViewById != null) {
                    CardDateBinding bind = CardDateBinding.bind(findChildViewById);
                    i = R.id.include_layout_empty_item;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_layout_empty_item);
                    if (findChildViewById2 != null) {
                        LayoutEmptyItemBinding bind2 = LayoutEmptyItemBinding.bind(findChildViewById2);
                        i = R.id.rv_hours_performed;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_hours_performed);
                        if (recyclerView != null) {
                            return new FragmentHoursPerformedBinding((ConstraintLayout) view, materialCardView, textView, bind, bind2, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHoursPerformedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_hours_performed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
