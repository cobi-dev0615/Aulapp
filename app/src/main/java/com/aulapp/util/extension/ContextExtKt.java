package com.gse.aulapp.util.extension;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"hasLocationPermission", BuildConfig.FLAVOR, "Landroid/content/Context;", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ContextExtKt {
    public static final boolean hasLocationPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
