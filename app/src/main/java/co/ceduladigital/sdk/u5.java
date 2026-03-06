package co.ceduladigital.sdk;

import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            case 1:
                NavController.lifecycleObserver$lambda$2((NavController) this.b, lifecycleOwner, event);
                break;
            default:
                SavedStateRegistry.performAttach$lambda$4((SavedStateRegistry) this.b, lifecycleOwner, event);
                break;
        }
    }
}
