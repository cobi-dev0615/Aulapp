package co.ceduladigital.sdk;

import android.view.View;
import com.gse.aulapp.util.ViewUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ r(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            default:
                ViewUtil.Companion.preventDoubleClick$lambda$0(this.b);
                break;
        }
    }
}
