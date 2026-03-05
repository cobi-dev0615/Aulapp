package co.ceduladigital.sdk;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class n3 implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ n3(int i) {
        this.a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$static$1;
        boolean isNormalPriorityEventFile;
        switch (this.a) {
            case 0:
                lambda$static$1 = CrashlyticsReportPersistence.lambda$static$1(file, str);
                return lambda$static$1;
            default:
                isNormalPriorityEventFile = CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str);
                return isNormalPriorityEventFile;
        }
    }
}
