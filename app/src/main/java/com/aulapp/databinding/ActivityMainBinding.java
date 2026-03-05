package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ActivityMainBinding {
    public final AppBarMainBinding appBarMain;
    public final DrawerLayoutBinding drawer;
    public final DrawerLayout drawerLayout;
    public final NavigationView navView;
    private final DrawerLayout rootView;

    private ActivityMainBinding(DrawerLayout drawerLayout, AppBarMainBinding appBarMainBinding, DrawerLayoutBinding drawerLayoutBinding, DrawerLayout drawerLayout2, NavigationView navigationView) {
        this.rootView = drawerLayout;
        this.appBarMain = appBarMainBinding;
        this.drawer = drawerLayoutBinding;
        this.drawerLayout = drawerLayout2;
        this.navView = navigationView;
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.app_bar_main;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.app_bar_main);
        if (findChildViewById != null) {
            AppBarMainBinding bind = AppBarMainBinding.bind(findChildViewById);
            i = R.id.drawer;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.drawer);
            if (findChildViewById2 != null) {
                DrawerLayoutBinding bind2 = DrawerLayoutBinding.bind(findChildViewById2);
                DrawerLayout drawerLayout = (DrawerLayout) view;
                i = R.id.nav_view;
                NavigationView navigationView = (NavigationView) ViewBindings.findChildViewById(view, R.id.nav_view);
                if (navigationView != null) {
                    return new ActivityMainBinding(drawerLayout, bind, bind2, drawerLayout, navigationView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public DrawerLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
