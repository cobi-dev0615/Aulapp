package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class LayoutHourPerformedTextBinding {
    public final TextView hourPerformedDescription;
    public final TextView hourPerformedTitle;
    public final ConstraintLayout layoutClassProgressText;
    private final ConstraintLayout rootView;

    private LayoutHourPerformedTextBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.hourPerformedDescription = textView;
        this.hourPerformedTitle = textView2;
        this.layoutClassProgressText = constraintLayout2;
    }

    public static LayoutHourPerformedTextBinding bind(View view) {
        int i = R.id.hour_performed_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.hour_performed_description);
        if (textView != null) {
            i = R.id.hour_performed_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.hour_performed_title);
            if (textView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new LayoutHourPerformedTextBinding(constraintLayout, textView, textView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
