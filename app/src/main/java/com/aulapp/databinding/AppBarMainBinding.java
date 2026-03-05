package com.gse.aulapp.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class AppBarMainBinding {
    public final AppBarLayout appbar;
    public final Toolbar mainToolbar;
    private final ConstraintLayout rootView;

    private AppBarMainBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.appbar = appBarLayout;
        this.mainToolbar = toolbar;
    }

    public static AppBarMainBinding bind(View view) {
        int i = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (appBarLayout != null) {
            i = R.id.main_toolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.main_toolbar);
            if (toolbar != null) {
                return new AppBarMainBinding((ConstraintLayout) view, appBarLayout, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
