package co.ceduladigital.sdk;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.karumi.dexter.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class t1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ t1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String checkBackgroundThread$lambda$2;
        String checkNotMainThread$lambda$0;
        String checkBlockingThread$lambda$1;
        Unit unit;
        Unit unit2;
        String str;
        switch (this.a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                checkBackgroundThread$lambda$2 = CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
                return checkBackgroundThread$lambda$2;
            case 11:
                checkNotMainThread$lambda$0 = CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
                return checkNotMainThread$lambda$0;
            case 12:
                checkBlockingThread$lambda$1 = CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
                return checkBlockingThread$lambda$1;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                unit = Unit.INSTANCE;
                return unit;
            case 19:
                return Unit.INSTANCE;
            case 20:
                unit2 = Unit.INSTANCE;
                return unit2;
            case 21:
                str = BuildConfig.FLAVOR;
                return str;
            default:
                return Unit.INSTANCE;
        }
    }
}
