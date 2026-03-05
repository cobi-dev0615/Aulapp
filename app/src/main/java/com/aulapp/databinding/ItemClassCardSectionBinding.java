package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemClassCardSectionBinding {
    public final ConstraintLayout clContainerClassCardSection;
    private final ConstraintLayout rootView;
    public final RecyclerView rvClassDetail;
    public final TextView tvClassDate;
    public final TextView tvClassDay;

    private ItemClassCardSectionBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.clContainerClassCardSection = constraintLayout2;
        this.rvClassDetail = recyclerView;
        this.tvClassDate = textView;
        this.tvClassDay = textView2;
    }

    public static ItemClassCardSectionBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.rv_class_detail;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_class_detail);
        if (recyclerView != null) {
            i = R.id.tv_class_date;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_date);
            if (textView != null) {
                i = R.id.tv_class_day;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_day);
                if (textView2 != null) {
                    return new ItemClassCardSectionBinding(constraintLayout, constraintLayout, recyclerView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemClassCardSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_class_card_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
