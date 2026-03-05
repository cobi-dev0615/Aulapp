package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemClassCardBinding {
    public final ItemClassCardDetailBinding includeClassCardDetail;
    public final ItemClassCardEmptyBinding includeClassCardEmpty;
    private final RelativeLayout rootView;

    private ItemClassCardBinding(RelativeLayout relativeLayout, ItemClassCardDetailBinding itemClassCardDetailBinding, ItemClassCardEmptyBinding itemClassCardEmptyBinding) {
        this.rootView = relativeLayout;
        this.includeClassCardDetail = itemClassCardDetailBinding;
        this.includeClassCardEmpty = itemClassCardEmptyBinding;
    }

    public static ItemClassCardBinding bind(View view) {
        int i = R.id.include_class_card_detail;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_class_card_detail);
        if (findChildViewById != null) {
            ItemClassCardDetailBinding bind = ItemClassCardDetailBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_class_card_empty);
            if (findChildViewById2 != null) {
                return new ItemClassCardBinding((RelativeLayout) view, bind, ItemClassCardEmptyBinding.bind(findChildViewById2));
            }
            i = R.id.include_class_card_empty;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemClassCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_class_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
