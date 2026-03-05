package co.ceduladigital.sdk;

import android.app.Activity;
import com.gse.aulapp.util.GpsUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ y5(Activity activity, long j, String str, int i) {
        this.a = i;
        this.b = activity;
        this.c = j;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit validatePermissionsAndStart$lambda$4;
        Unit validatePermissionsAndStart$lambda$4$lambda$3;
        Unit startGps$lambda$10$lambda$8;
        switch (this.a) {
            case 0:
                validatePermissionsAndStart$lambda$4 = GpsUtil.Companion.validatePermissionsAndStart$lambda$4(this.b, this.c, this.d);
                return validatePermissionsAndStart$lambda$4;
            case 1:
                validatePermissionsAndStart$lambda$4$lambda$3 = GpsUtil.Companion.validatePermissionsAndStart$lambda$4$lambda$3(this.b, this.c, this.d);
                return validatePermissionsAndStart$lambda$4$lambda$3;
            default:
                startGps$lambda$10$lambda$8 = GpsUtil.Companion.startGps$lambda$10$lambda$8(this.b, this.c, this.d);
                return startGps$lambda$10$lambda$8;
        }
    }
}
