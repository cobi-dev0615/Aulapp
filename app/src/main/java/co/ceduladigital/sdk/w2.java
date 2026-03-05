package co.ceduladigital.sdk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;

/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements OnContextAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ w2(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        switch (this.a) {
            case 0:
                this.b.lambda$new$2(context);
                break;
            default:
                ((FragmentActivity) this.b).lambda$init$3(context);
                break;
        }
    }
}
