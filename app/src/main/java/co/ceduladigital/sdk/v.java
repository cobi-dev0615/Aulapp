package co.ceduladigital.sdk;

import android.content.Context;
import androidx.camera.view.PreviewView;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements ComponentRegistrarProcessor, Transformer, OnFailureListener, FirebaseAppLifecycleListener, TextInputLayout.LengthCounter {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    public void onDeleted(String name, com.google.firebase.FirebaseOptions options) {
        /* empty stub for FirebaseAppLifecycleListener */
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        throw new UnsupportedOperationException("Not decompiled");
    }

    public String extract(Object obj) {
        throw new UnsupportedOperationException("Not decompiled");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        throw new UnsupportedOperationException("Not decompiled");
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public int countLength(android.text.Editable editableText) {
        throw new UnsupportedOperationException("Not decompiled");
    }

    public /* synthetic */ v(PreviewView previewView) {
        this.a = 11;
    }
}
