package co.ceduladigital.sdk;

import android.animation.Animator;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.material.navigation.NavigationView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements CallbackToFutureAdapter.Resolver, CancellationSignal.OnCancelListener, NavigationView.OnNavigationItemSelectedListener, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c3(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Object lambda$logAndUpdateState$5;
        Object lambda$logAndUpdateState$7;
        switch (this.a) {
            case 3:
                lambda$logAndUpdateState$5 = ((Uploader) this.b).lambda$logAndUpdateState$5((Iterable) this.c);
                return lambda$logAndUpdateState$5;
            default:
                lambda$logAndUpdateState$7 = ((Uploader) this.b).lambda$logAndUpdateState$7((HashMap) this.c);
                return lambda$logAndUpdateState$7;
        }
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        DefaultSpecialEffectsController.startAnimations$lambda$3((Animator) this.b, (SpecialEffectsController.Operation) this.c);
    }
}
