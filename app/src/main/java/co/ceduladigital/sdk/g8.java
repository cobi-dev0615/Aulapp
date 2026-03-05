package co.ceduladigital.sdk;

import com.google.android.material.search.SearchView;

/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ g8(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 1:
                this.b.lambda$clearFocusAndHideKeyboard$9();
                break;
            case 2:
                this.b.show();
                break;
            default:
                this.b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
