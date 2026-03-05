package co.ceduladigital.sdk;

import androidx.profileinstaller.DeviceProfileWriter;
import androidx.profileinstaller.ProfileInstaller;

/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v3(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DeviceProfileWriter) this.d).lambda$result$0(this.b, this.c);
                break;
            default:
                ((ProfileInstaller.DiagnosticsCallback) this.d).onResultReceived(this.b, this.c);
                break;
        }
    }
}
