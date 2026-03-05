package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemDetailBinding {
    private final ConstraintLayout rootView;
    public final TextView tvContent;

    private ItemDetailBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.tvContent = textView;
    }

    public static ItemDetailBinding bind(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
        if (textView != null) {
            return new ItemDetailBinding((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_content)));
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
