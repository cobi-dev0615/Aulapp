package co.ceduladigital.sdk;

import android.graphics.Canvas;
import androidx.core.os.CancellationSignal;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.activity.result.ActivityResultCallback;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.canvas.CanvasCompat;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment;
import com.gse.aulapp.util.GpsUtil;
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
        // Stubbed: NavigationView.lambda$dispatchDraw$0
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        // Stubbed: EventGDTLogger.encode (FirebaseSessions)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.a) {
            case 15:
                return ((ClientHealthMetricsStore) this.b).loadClientMetrics();
            case 16:
                return Integer.valueOf(((EventStore) this.b).cleanUp());
            case 17:
                // Stubbed: Uploader.lambda$logAndUpdateState$6
                return null;
            default:
                // Stubbed: WorkInitializer.lambda$ensureContextsScheduled$0
                return null;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        switch (this.a) {
            case 0:
                // Stubbed: CrashlyticsNativeComponentDeferredProxy.lambda$new$0
                break;
            default:
                // Stubbed: RemoteConfigDeferredProxy.lambda$setupListener$0
                break;
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        WebviewFragment.requestPermissionLauncher$lambda$0((WebviewFragment) this.b, ((Boolean) obj).booleanValue());
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        // Stubbed: SpecialEffectsController.Operation._init_$lambda$0
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
        // Stubbed: SearchBar.lambda$new$0
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        // Stubbed: missing interface method
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfo, int flags, android.os.Bundle opts) {
        // Stubbed: missing interface method
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 1:
                // Stubbed: CrashlyticsWorker.lambda$submitTask$2
                throw new UnsupportedOperationException("Decompiled stub");
            case 2:
                // Stubbed: CrashlyticsWorker.lambda$submit$1
                throw new UnsupportedOperationException("Decompiled stub");
            case 13:
                // Stubbed: SessionReportingCoordinator.onReportSendComplete
                return Boolean.valueOf(true);
            default:
                // Stubbed: Utils.lambda$awaitEvenIfOnMainThread$0
                return null;
        }
    }
}
