package co.ceduladigital.sdk;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.fragment.app.SpecialEffectsController;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DefaultSpecialEffectsController.executeOperations$lambda$2((List) this.b, (SpecialEffectsController.Operation) this.c, (DefaultSpecialEffectsController) this.d);
                break;
            default:
                DefaultSpecialEffectsController.startTransitions$lambda$10((FragmentTransitionImpl) this.b, (View) this.c, (Rect) this.d);
                break;
        }
    }
}
