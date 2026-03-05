package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ContainerBarFiltersBinding {
    public final ImageView actionCalendar;
    public final ImageView actionFilter;
    public final LinearLayout containerFilters;
    public final LinearLayout containerSubtitle;
    private final ConstraintLayout rootView;
    public final TextView subtitle;

    private ContainerBarFiltersBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.actionCalendar = imageView;
        this.actionFilter = imageView2;
        this.containerFilters = linearLayout;
        this.containerSubtitle = linearLayout2;
        this.subtitle = textView;
    }

    public static ContainerBarFiltersBinding bind(View view) {
        int i = R.id.action_calendar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.action_calendar);
        if (imageView != null) {
            i = R.id.action_filter;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.action_filter);
            if (imageView2 != null) {
                i = R.id.container_filters;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.container_filters);
                if (linearLayout != null) {
                    i = R.id.container_subtitle;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.container_subtitle);
                    if (linearLayout2 != null) {
                        i = R.id.subtitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.subtitle);
                        if (textView != null) {
                            return new ContainerBarFiltersBinding((ConstraintLayout) view, imageView, imageView2, linearLayout, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
