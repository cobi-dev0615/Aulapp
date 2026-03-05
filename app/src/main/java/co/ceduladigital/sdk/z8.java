package co.ceduladigital.sdk;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewConfiguration b;

    public /* synthetic */ z8(ViewConfiguration viewConfiguration, int i) {
        this.a = i;
        this.b = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return Integer.valueOf(this.b.getScaledMaximumFlingVelocity());
            default:
                return Integer.valueOf(this.b.getScaledMinimumFlingVelocity());
        }
    }
}
