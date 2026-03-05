package co.ceduladigital.sdk;

import androidx.core.os.CancellationSignal;
import androidx.transition.FragmentTransitionSupport;
import androidx.transition.Transition;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import java.util.concurrent.atomic.AtomicBoolean;

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
        Object lambda$schedule$0;
        lambda$schedule$0 = ((DefaultScheduler) this.a).lambda$schedule$0((TransportContext) this.b, (EventInternal) this.c);
        return lambda$schedule$0;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.a, (Transition) this.b, (Runnable) this.c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$race$0;
        lambda$race$0 = CrashlyticsTasks.lambda$race$0((TaskCompletionSource) this.a, (AtomicBoolean) this.b, (CancellationTokenSource) this.c, task);
        return lambda$race$0;
    }
}
