package com.gse.aulapp.util;

import android.location.Location;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/util/LocationClient;", BuildConfig.FLAVOR, "getLocationUpdates", "Lkotlinx/coroutines/flow/Flow;", "Landroid/location/Location;", "interval", BuildConfig.FLAVOR, "LocationException", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LocationClient {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/util/LocationClient$LocationException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "message", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationException extends Exception {
        public LocationException(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    Flow<Location> getLocationUpdates(long interval);
}
