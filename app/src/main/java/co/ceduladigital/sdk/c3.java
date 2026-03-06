package co.ceduladigital.sdk;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.CancellationSignal;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.material.navigation.NavigationView;

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
        switch (this.a) {
            case 3:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        throw new UnsupportedOperationException("Not decompiled");
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return null;
    }

    @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(android.view.MenuItem item) {
        return false;
    }
}
