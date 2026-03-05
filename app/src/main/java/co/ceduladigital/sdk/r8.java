package co.ceduladigital.sdk;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ r8(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.collapseActionView();
                break;
            default:
                this.b.invalidateMenu();
                break;
        }
    }
}
