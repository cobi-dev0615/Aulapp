package co.ceduladigital.sdk;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ SettingsProvider c;

    public /* synthetic */ g3(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i) {
        this.a = i;
        this.b = crashlyticsCore;
        this.c = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$doBackgroundInitializationAsync$0(this.c);
                break;
            default:
                this.b.lambda$finishInitSynchronously$9(this.c);
                break;
        }
    }
}
