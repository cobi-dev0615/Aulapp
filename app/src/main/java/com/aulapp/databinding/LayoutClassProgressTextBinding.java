package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class LayoutClassProgressTextBinding {
    public final TextView classProgressDescription;
    public final TextView classProgressTitle;
    public final ConstraintLayout layoutClassProgressText;
    private final ConstraintLayout rootView;

    private LayoutClassProgressTextBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.classProgressDescription = textView;
        this.classProgressTitle = textView2;
        this.layoutClassProgressText = constraintLayout2;
    }

    public static LayoutClassProgressTextBinding bind(View view) {
        int i = R.id.class_progress_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.class_progress_description);
        if (textView != null) {
            i = R.id.class_progress_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.class_progress_title);
            if (textView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new LayoutClassProgressTextBinding(constraintLayout, textView, textView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
