package co.ceduladigital.sdk;

import android.window.OnBackInvokedCallback;
import androidx.view.OnBackPressedDispatcher;
import com.google.android.material.motion.MaterialBackHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class a7 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((MaterialBackHandler) this.b).handleBackInvoked();
                break;
            case 1:
                OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0((Function0) this.b);
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
