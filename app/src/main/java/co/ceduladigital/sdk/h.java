package co.ceduladigital.sdk;

import android.view.View;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(boolean z, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                ViewUtils.showKeyboard((View) this.c, this.b);
                break;
        }
    }
}
