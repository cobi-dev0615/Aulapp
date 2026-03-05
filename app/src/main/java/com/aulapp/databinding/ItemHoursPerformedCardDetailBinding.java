package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemHoursPerformedCardDetailBinding {
    public final ConstraintLayout clClassCard;
    public final MaterialCardView cvPracticeClassClassCard;
    public final ImageView ivPracticeClassIconCard;
    private final MaterialCardView rootView;
    public final TextView titleTotalHoursPerfomedWheel;
    public final TextView totalHoursPerfomed;
    public final TextView tvPracticeClassTitleClassCard;

    private ItemHoursPerformedCardDetailBinding(MaterialCardView materialCardView, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialCardView;
        this.clClassCard = constraintLayout;
        this.cvPracticeClassClassCard = materialCardView2;
        this.ivPracticeClassIconCard = imageView;
        this.titleTotalHoursPerfomedWheel = textView;
        this.totalHoursPerfomed = textView2;
        this.tvPracticeClassTitleClassCard = textView3;
    }

    public static ItemHoursPerformedCardDetailBinding bind(View view) {
        int i = R.id.cl_class_card;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_class_card);
        if (constraintLayout != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i = R.id.iv_practice_class_icon_card;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_practice_class_icon_card);
            if (imageView != null) {
                i = R.id.title_total_hours_perfomed_wheel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_total_hours_perfomed_wheel);
                if (textView != null) {
                    i = R.id.total_hours_perfomed;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.total_hours_perfomed);
                    if (textView2 != null) {
                        i = R.id.tv_practice_class_title_class_card;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_practice_class_title_class_card);
                        if (textView3 != null) {
                            return new ItemHoursPerformedCardDetailBinding(materialCardView, constraintLayout, materialCardView, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
