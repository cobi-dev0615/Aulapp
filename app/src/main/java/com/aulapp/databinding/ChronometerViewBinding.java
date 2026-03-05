package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.slider.Slider;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ChronometerViewBinding {
    public final ImageView chronometerIcon;
    public final ConstraintLayout chronometerView;
    public final Guideline guidelineEnd;
    public final Guideline guidelineQr;
    public final Guideline guidelineQr3;
    public final Guideline guidelineStart;
    public final ImageView ivQr;
    public final CardView qrContainer;
    private final ConstraintLayout rootView;
    public final Slider sliderTimer;
    public final TextView tvTimer;
    public final TextView tvTimerTitle;

    private ChronometerViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ImageView imageView2, CardView cardView, Slider slider, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.chronometerIcon = imageView;
        this.chronometerView = constraintLayout2;
        this.guidelineEnd = guideline;
        this.guidelineQr = guideline2;
        this.guidelineQr3 = guideline3;
        this.guidelineStart = guideline4;
        this.ivQr = imageView2;
        this.qrContainer = cardView;
        this.sliderTimer = slider;
        this.tvTimer = textView;
        this.tvTimerTitle = textView2;
    }

    public static ChronometerViewBinding bind(View view) {
        int i = R.id.chronometer_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.chronometer_icon);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.guideline_end;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline_end);
            if (guideline != null) {
                i = R.id.guideline_qr;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline_qr);
                if (guideline2 != null) {
                    i = R.id.guideline_qr_3;
                    Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline_qr_3);
                    if (guideline3 != null) {
                        i = R.id.guideline_start;
                        Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline_start);
                        if (guideline4 != null) {
                            i = R.id.iv_qr;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_qr);
                            if (imageView2 != null) {
                                i = R.id.qr_container;
                                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.qr_container);
                                if (cardView != null) {
                                    i = R.id.slider_timer;
                                    Slider slider = (Slider) ViewBindings.findChildViewById(view, R.id.slider_timer);
                                    if (slider != null) {
                                        i = R.id.tv_timer;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timer);
                                        if (textView != null) {
                                            i = R.id.tv_timer_title;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timer_title);
                                            if (textView2 != null) {
                                                return new ChronometerViewBinding(constraintLayout, imageView, constraintLayout, guideline, guideline2, guideline3, guideline4, imageView2, cardView, slider, textView, textView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
