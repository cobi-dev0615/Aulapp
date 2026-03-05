package co.ceduladigital.sdk;

import androidx.datastore.core.CorruptionException;
import com.google.android.gms.time.TrustedTimeClient;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.gse.aulapp.GeneralApp;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* loaded from: classes2.dex */
public final /* synthetic */ class f3 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ f3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoroutineDispatcher _init_$lambda$0;
        ExecutorCoroutineDispatcher _init_$lambda$02;
        SessionConfigs sessionConfigsDataStore$lambda$0;
        Unit initializeTrustedTimeClient$lambda$0;
        switch (this.a) {
            case 0:
                _init_$lambda$0 = CoroutineDispatcher.Companion._init_$lambda$0((CoroutineContext.Element) obj);
                return _init_$lambda$0;
            case 1:
                _init_$lambda$02 = ExecutorCoroutineDispatcher.Companion._init_$lambda$0((CoroutineContext.Element) obj);
                return _init_$lambda$02;
            case 2:
                sessionConfigsDataStore$lambda$0 = FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$0((CorruptionException) obj);
                return sessionConfigsDataStore$lambda$0;
            default:
                initializeTrustedTimeClient$lambda$0 = GeneralApp.initializeTrustedTimeClient$lambda$0((TrustedTimeClient) obj);
                return initializeTrustedTimeClient$lambda$0;
        }
    }
}
