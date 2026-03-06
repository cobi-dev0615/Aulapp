package co.ceduladigital.sdk;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;

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
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            case 1:
                throw new UnsupportedOperationException("Not decompiled");
            case 2:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
