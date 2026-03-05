package co.ceduladigital.sdk;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.ComponentActivity;
import androidx.view.SavedStateHandle;
import androidx.view.SavedStateRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Bundle lambda$new$1;
        Bundle lambda$init$0;
        Bundle lambda$attachController$4;
        Bundle savedStateProvider$lambda$0;
        switch (this.a) {
            case 0:
                lambda$new$1 = ((ComponentActivity) this.b).lambda$new$1();
                return lambda$new$1;
            case 1:
                lambda$init$0 = ((FragmentActivity) this.b).lambda$init$0();
                return lambda$init$0;
            case 2:
                lambda$attachController$4 = ((FragmentManager) this.b).lambda$attachController$4();
                return lambda$attachController$4;
            default:
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0((SavedStateHandle) this.b);
                return savedStateProvider$lambda$0;
        }
    }
}
