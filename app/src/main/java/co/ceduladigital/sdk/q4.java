package co.ceduladigital.sdk;

import android.content.Context;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class q4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ q4(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File sessionConfigsDataStore$lambda$2;
        File sessionDataStore$lambda$5;
        switch (this.a) {
            case 0:
                sessionConfigsDataStore$lambda$2 = FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$2(this.b);
                return sessionConfigsDataStore$lambda$2;
            default:
                sessionDataStore$lambda$5 = FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$5(this.b);
                return sessionDataStore$lambda$5;
        }
    }
}
