package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class LayoutEmptyItemBinding {
    public final TextView emptyItemDescription;
    public final ImageView emptyItemImage;
    public final TextView emptyItemTitle;
    private final ConstraintLayout rootView;

    private LayoutEmptyItemBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.rootView = constraintLayout;
        this.emptyItemDescription = textView;
        this.emptyItemImage = imageView;
        this.emptyItemTitle = textView2;
    }

    public static LayoutEmptyItemBinding bind(View view) {
        int i = R.id.empty_item_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.empty_item_description);
        if (textView != null) {
            i = R.id.empty_item_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.empty_item_image);
            if (imageView != null) {
                i = R.id.empty_item_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.empty_item_title);
                if (textView2 != null) {
                    return new LayoutEmptyItemBinding((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
