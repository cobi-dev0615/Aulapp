package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class DialogExamInfoLayoutBinding {
    public final ConstraintLayout dialogContener;
    public final LayoutPracticeClassInfoBinding includeLayoutPracticeClassCard;
    public final ImageView ivQr;
    public final LinearLayout llExamInfo;
    public final CardView qrContainer;
    private final ConstraintLayout rootView;
    public final TextView tvMinimunTime;
    public final TextView tvTimer;
    public final TextView tvTimerTitle;

    private DialogExamInfoLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LayoutPracticeClassInfoBinding layoutPracticeClassInfoBinding, ImageView imageView, LinearLayout linearLayout, CardView cardView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.dialogContener = constraintLayout2;
        this.includeLayoutPracticeClassCard = layoutPracticeClassInfoBinding;
        this.ivQr = imageView;
        this.llExamInfo = linearLayout;
        this.qrContainer = cardView;
        this.tvMinimunTime = textView;
        this.tvTimer = textView2;
        this.tvTimerTitle = textView3;
    }

    public static DialogExamInfoLayoutBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.include_layout_practice_class_card;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_layout_practice_class_card);
        if (findChildViewById != null) {
            LayoutPracticeClassInfoBinding bind = LayoutPracticeClassInfoBinding.bind(findChildViewById);
            i = R.id.iv_qr;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_qr);
            if (imageView != null) {
                i = R.id.ll_exam_info;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_exam_info);
                if (linearLayout != null) {
                    i = R.id.qr_container;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.qr_container);
                    if (cardView != null) {
                        i = R.id.tv_minimun_time;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_minimun_time);
                        if (textView != null) {
                            i = R.id.tv_timer;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timer);
                            if (textView2 != null) {
                                i = R.id.tv_timer_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timer_title);
                                if (textView3 != null) {
                                    return new DialogExamInfoLayoutBinding(constraintLayout, constraintLayout, bind, imageView, linearLayout, cardView, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DialogExamInfoLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogExamInfoLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_exam_info_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
