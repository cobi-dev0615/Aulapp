package co.ceduladigital.sdk;

import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.PreviewCallback;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraInstance b;
    public final /* synthetic */ PreviewCallback c;

    public /* synthetic */ w(CameraInstance cameraInstance, PreviewCallback previewCallback, int i) {
        this.a = i;
        this.b = cameraInstance;
        this.c = previewCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$requestPreview$3(this.c);
                break;
            default:
                this.b.lambda$requestPreview$2(this.c);
                break;
        }
    }
}
