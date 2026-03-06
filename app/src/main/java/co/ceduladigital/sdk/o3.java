package co.ceduladigital.sdk;

import androidx.core.os.CancellationSignal;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements Continuation, SynchronizationGuard.CriticalSection, CancellationSignal.OnCancelListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        throw new UnsupportedOperationException("Not decompiled");
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        throw new UnsupportedOperationException("Not decompiled");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        // Stubbed: CrashlyticsTasks.lambda$race$0
        throw new UnsupportedOperationException("Decompiled stub");
    }
}
