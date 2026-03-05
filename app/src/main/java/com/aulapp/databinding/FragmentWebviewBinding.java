package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentWebviewBinding {
    public final RelativeLayout layoutContainerWidger;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final WebView webviewBiometric;

    private FragmentWebviewBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ScrollView scrollView, WebView webView) {
        this.rootView = relativeLayout;
        this.layoutContainerWidger = relativeLayout2;
        this.scrollView = scrollView;
        this.webviewBiometric = webView;
    }

    public static FragmentWebviewBinding bind(View view) {
        int i = R.id.layoutContainerWidger;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layoutContainerWidger);
        if (relativeLayout != null) {
            i = R.id.scrollView;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
            if (scrollView != null) {
                i = R.id.webview_biometric;
                WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webview_biometric);
                if (webView != null) {
                    return new FragmentWebviewBinding((RelativeLayout) view, relativeLayout, scrollView, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
