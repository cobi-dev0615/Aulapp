package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class CardDateBinding {
    public final MaterialCardView cvHistoryDate;
    public final ImageButton dateLeft;
    public final TextView dateMonth;
    public final ImageButton dateRight;
    public final TextView dateYear;
    private final ConstraintLayout rootView;

    private CardDateBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ImageButton imageButton, TextView textView, ImageButton imageButton2, TextView textView2) {
        this.rootView = constraintLayout;
        this.cvHistoryDate = materialCardView;
        this.dateLeft = imageButton;
        this.dateMonth = textView;
        this.dateRight = imageButton2;
        this.dateYear = textView2;
    }

    public static CardDateBinding bind(View view) {
        int i = R.id.cv_history_date;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cv_history_date);
        if (materialCardView != null) {
            i = R.id.date_left;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.date_left);
            if (imageButton != null) {
                i = R.id.date_month;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.date_month);
                if (textView != null) {
                    i = R.id.date_right;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, R.id.date_right);
                    if (imageButton2 != null) {
                        i = R.id.date_year;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.date_year);
                        if (textView2 != null) {
                            return new CardDateBinding((ConstraintLayout) view, materialCardView, imageButton, textView, imageButton2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
