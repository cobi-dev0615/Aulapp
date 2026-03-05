package co.ceduladigital.sdk;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OptionsBundle;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;
import kotlin.uuid.Uuid;

/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ m3(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        int oldestEventFileFirst;
        int lambda$static$02;
        int lambda$getSortedCustomAttributes$1;
        int LEXICAL_ORDER$lambda$2;
        switch (this.a) {
            case 0:
                lambda$static$0 = CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
                return lambda$static$0;
            case 1:
                oldestEventFileFirst = CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
                return oldestEventFileFirst;
            case 2:
                lambda$static$02 = OptionsBundle.lambda$static$0((Config.Option) obj, (Config.Option) obj2);
                return lambda$static$02;
            case 3:
                lambda$getSortedCustomAttributes$1 = SessionReportingCoordinator.lambda$getSortedCustomAttributes$1((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
                return lambda$getSortedCustomAttributes$1;
            default:
                LEXICAL_ORDER$lambda$2 = Uuid.LEXICAL_ORDER$lambda$2((Uuid) obj, (Uuid) obj2);
                return LEXICAL_ORDER$lambda$2;
        }
    }
}
