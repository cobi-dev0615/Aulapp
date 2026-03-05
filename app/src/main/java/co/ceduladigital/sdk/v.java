package co.ceduladigital.sdk;

import android.content.Context;
import androidx.camera.core.impl.CameraDeviceSurfaceManager$Provider;
import androidx.camera.core.impl.CameraFactory$Provider;
import androidx.camera.core.impl.UseCaseConfigFactory$Provider;
import androidx.camera.view.PreviewView;
import androidx.camera.view.impl.ZoomGestureDetector;
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
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements CameraFactory$Provider, CameraDeviceSurfaceManager$Provider, UseCaseConfigFactory$Provider, ComponentRegistrarProcessor, Transformer, LibraryVersionComponent.VersionExtractor, OnFailureListener, FirebaseAppLifecycleListener, ZoomGestureDetector.OnZoomGestureListener, TextInputLayout.LengthCounter {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        byte[] lambda$static$0;
        lambda$static$0 = DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
        return lambda$static$0;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$0;
        String lambda$getComponents$1;
        String lambda$getComponents$2;
        String lambda$getComponents$3;
        Context context = (Context) obj;
        switch (this.a) {
            case 5:
                lambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0(context);
                return lambda$getComponents$0;
            case 6:
                lambda$getComponents$1 = FirebaseCommonRegistrar.lambda$getComponents$1(context);
                return lambda$getComponents$1;
            case 7:
                lambda$getComponents$2 = FirebaseCommonRegistrar.lambda$getComponents$2(context);
                return lambda$getComponents$2;
            default:
                lambda$getComponents$3 = FirebaseCommonRegistrar.lambda$getComponents$3(context);
                return lambda$getComponents$3;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        FirebaseCrashlytics.lambda$init$0(exc);
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public /* synthetic */ v(PreviewView previewView) {
        this.a = 11;
    }
}
