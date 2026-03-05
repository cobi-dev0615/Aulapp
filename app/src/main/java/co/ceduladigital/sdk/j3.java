package co.ceduladigital.sdk;

import android.graphics.Canvas;
import androidx.core.os.CancellationSignal;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.fragment.app.SpecialEffectsController;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.result.ActivityResultCallback;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.search.SearchBar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment;
import com.gse.aulapp.util.GpsUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Deferred.DeferredHandler, Continuation, Transformer, OnSuccessListener, OnFailureListener, SwipeRefreshLayout.OnRefreshListener, InputConnectionCompat.OnCommitContentListener, CanvasCompat.CanvasOperation, AccessibilityManagerCompat.TouchExplorationStateChangeListener, CancellationSignal.OnCancelListener, SynchronizationGuard.CriticalSection, ActivityResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public void a(Canvas canvas) {
        ((NavigationView) this.b).lambda$dispatchDraw$0(canvas);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        byte[] encode;
        encode = ((EventGDTLogger) this.b).encode((SessionEvent) obj);
        return encode;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Object lambda$logAndUpdateState$6;
        Object lambda$ensureContextsScheduled$0;
        switch (this.a) {
            case 15:
                return ((ClientHealthMetricsStore) this.b).loadClientMetrics();
            case 16:
                return Integer.valueOf(((EventStore) this.b).cleanUp());
            case 17:
                lambda$logAndUpdateState$6 = ((Uploader) this.b).lambda$logAndUpdateState$6();
                return lambda$logAndUpdateState$6;
            default:
                lambda$ensureContextsScheduled$0 = ((WorkInitializer) this.b).lambda$ensureContextsScheduled$0();
                return lambda$ensureContextsScheduled$0;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        switch (this.a) {
            case 0:
                ((CrashlyticsNativeComponentDeferredProxy) this.b).lambda$new$0(provider);
                break;
            default:
                RemoteConfigDeferredProxy.lambda$setupListener$0((CrashlyticsRemoteConfigListener) this.b, provider);
                break;
        }
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        WebviewFragment.requestPermissionLauncher$lambda$0((WebviewFragment) this.b, ((Boolean) obj).booleanValue());
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        SpecialEffectsController.Operation._init_$lambda$0((SpecialEffectsController.Operation) this.b);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 5:
                GeneralApp.initializeTrustedTimeClient$lambda$2((GeneralApp) this.b, exc);
                break;
            default:
                GpsUtil.Companion.locationEnabled$lambda$15((Function1) this.b, exc);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 4:
                GeneralApp.initializeTrustedTimeClient$lambda$1((f3) this.b, obj);
                break;
            default:
                GpsUtil.Companion.locationEnabled$lambda$14((o1) this.b, obj);
                break;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        ((SearchBar) this.b).lambda$new$0(z);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$submitTask$2;
        Task lambda$submit$1;
        boolean onReportSendComplete;
        Object lambda$awaitEvenIfOnMainThread$0;
        switch (this.a) {
            case 1:
                lambda$submitTask$2 = CrashlyticsWorker.lambda$submitTask$2((Callable) this.b, task);
                return lambda$submitTask$2;
            case 2:
                lambda$submit$1 = CrashlyticsWorker.lambda$submit$1((Runnable) this.b, task);
                return lambda$submit$1;
            case 13:
                onReportSendComplete = ((SessionReportingCoordinator) this.b).onReportSendComplete(task);
                return Boolean.valueOf(onReportSendComplete);
            default:
                lambda$awaitEvenIfOnMainThread$0 = Utils.lambda$awaitEvenIfOnMainThread$0((CountDownLatch) this.b, task);
                return lambda$awaitEvenIfOnMainThread$0;
        }
    }
}
