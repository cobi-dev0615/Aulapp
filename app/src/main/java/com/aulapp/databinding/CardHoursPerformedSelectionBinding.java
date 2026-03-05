package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class CardHoursPerformedSelectionBinding {
    public final LayoutHourPerformedTextBinding includeHourPerfomedAddress;
    public final LayoutHourPerformedTextBinding includeHourPerfomedCellphone;
    private final MaterialCardView rootView;
    public final RecyclerView rvDetailHours;
    public final TextView tvNameCea;

    private CardHoursPerformedSelectionBinding(MaterialCardView materialCardView, LayoutHourPerformedTextBinding layoutHourPerformedTextBinding, LayoutHourPerformedTextBinding layoutHourPerformedTextBinding2, RecyclerView recyclerView, TextView textView) {
        this.rootView = materialCardView;
        this.includeHourPerfomedAddress = layoutHourPerformedTextBinding;
        this.includeHourPerfomedCellphone = layoutHourPerformedTextBinding2;
        this.rvDetailHours = recyclerView;
        this.tvNameCea = textView;
    }

    public static CardHoursPerformedSelectionBinding bind(View view) {
        int i = R.id.include_hour_perfomed_address;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_hour_perfomed_address);
        if (findChildViewById != null) {
            LayoutHourPerformedTextBinding bind = LayoutHourPerformedTextBinding.bind(findChildViewById);
            i = R.id.include_hour_perfomed_cellphone;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_hour_perfomed_cellphone);
            if (findChildViewById2 != null) {
                LayoutHourPerformedTextBinding bind2 = LayoutHourPerformedTextBinding.bind(findChildViewById2);
                i = R.id.rv_detail_hours;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_detail_hours);
                if (recyclerView != null) {
                    i = R.id.tv_name_cea;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_cea);
                    if (textView != null) {
                        return new CardHoursPerformedSelectionBinding((MaterialCardView) view, bind, bind2, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CardHoursPerformedSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.card_hours_performed_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
