package co.ceduladigital.sdk;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;

/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements ViewUtils.OnApplyWindowInsetsListener, OnApplyWindowInsetsListener {
    public final /* synthetic */ SearchView a;

    public /* synthetic */ i8(SearchView searchView) {
        this.a = searchView;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat lambda$setUpStatusBarSpacerInsetListener$5;
        lambda$setUpStatusBarSpacerInsetListener$5 = this.a.lambda$setUpStatusBarSpacerInsetListener$5(view, windowInsetsCompat);
        return lambda$setUpStatusBarSpacerInsetListener$5;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        WindowInsetsCompat lambda$setUpToolbarInsetListener$4;
        lambda$setUpToolbarInsetListener$4 = this.a.lambda$setUpToolbarInsetListener$4(view, windowInsetsCompat, relativePadding);
        return lambda$setUpToolbarInsetListener$4;
    }
}
