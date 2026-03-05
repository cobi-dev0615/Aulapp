package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemTextDrawerMenuBinding {
    public final ImageView ivTextDrawerMenu;
    public final LinearLayout layoutClassProgressText;
    private final LinearLayout rootView;
    public final TextView textDrawerCardContent;
    public final TextView textDrawerCardTitle;

    private ItemTextDrawerMenuBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivTextDrawerMenu = imageView;
        this.layoutClassProgressText = linearLayout2;
        this.textDrawerCardContent = textView;
        this.textDrawerCardTitle = textView2;
    }

    public static ItemTextDrawerMenuBinding bind(View view) {
        int i = R.id.iv_text_drawer_menu;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_text_drawer_menu);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.text_drawer_card_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_card_content);
            if (textView != null) {
                i = R.id.text_drawer_card_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_card_title);
                if (textView2 != null) {
                    return new ItemTextDrawerMenuBinding(linearLayout, imageView, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
