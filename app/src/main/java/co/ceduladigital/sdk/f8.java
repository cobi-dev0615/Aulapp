package co.ceduladigital.sdk;

import android.view.View;
import com.google.android.material.search.SearchView;

/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ f8(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.lambda$setUpClearButton$2(view);
                break;
            case 1:
                this.b.lambda$setupWithSearchBar$7(view);
                break;
            default:
                this.b.lambda$setUpBackButton$1(view);
                break;
        }
    }
}
