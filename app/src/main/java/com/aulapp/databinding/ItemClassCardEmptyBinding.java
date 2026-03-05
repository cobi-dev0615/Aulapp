package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemClassCardEmptyBinding {
    public final ConstraintLayout clContainerClassCardEmpty;
    public final CardView cvContainerClassCardEmpty;
    private final CardView rootView;
    public final TextView tvClassCardEmptyDescription;

    private ItemClassCardEmptyBinding(CardView cardView, ConstraintLayout constraintLayout, CardView cardView2, TextView textView) {
        this.rootView = cardView;
        this.clContainerClassCardEmpty = constraintLayout;
        this.cvContainerClassCardEmpty = cardView2;
        this.tvClassCardEmptyDescription = textView;
    }

    public static ItemClassCardEmptyBinding bind(View view) {
        int i = R.id.cl_container_class_card_empty;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_container_class_card_empty);
        if (constraintLayout != null) {
            CardView cardView = (CardView) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_card_empty_description);
            if (textView != null) {
                return new ItemClassCardEmptyBinding(cardView, constraintLayout, cardView, textView);
            }
            i = R.id.tv_class_card_empty_description;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public CardView getRoot() {
        return this.rootView;
    }
}
