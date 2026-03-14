package co.ceduladigital.sdk;

import androidx.collection.ArrayMap;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t3(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, ArrayMap arrayMap) {
        this.a = 0;
        this.c = operation;
        this.d = operation2;
        this.b = z;
        this.e = arrayMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                // Stubbed: SessionReportingCoordinator.lambda$persistEvent$0 (EventMetadata)
                throw new UnsupportedOperationException("Decompiled stub");
        }
    }

    public /* synthetic */ t3(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, Object eventMetadata, boolean z) {
        this.a = 1;
        this.c = sessionReportingCoordinator;
        this.d = event;
        this.e = eventMetadata;
        this.b = z;
    }
}
