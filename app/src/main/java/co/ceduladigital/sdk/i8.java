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
        return windowInsetsCompat;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        return windowInsetsCompat;
    }
}
