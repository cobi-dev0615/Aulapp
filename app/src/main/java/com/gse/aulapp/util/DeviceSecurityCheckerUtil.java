package com.gse.aulapp.util;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.gse.aulapp.model.enumerate.EnumDeviceSecurity;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000eJ\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/gse/aulapp/util/DeviceSecurityCheckerUtil;", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "TAG", BuildConfig.FLAVOR, "isEmulator", BuildConfig.FLAVOR, "isRooted", "isDeveloperModeEnabled", "isDebuggingEnabled", "validateDeviceSecurityChecker", BuildConfig.FLAVOR, "validateMapDeviceSecurity", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSecurityCheckerUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSecurityCheckerUtil.kt\ncom/gse/aulapp/util/DeviceSecurityCheckerUtil\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,92:1\n216#2,2:93\n*S KotlinDebug\n*F\n+ 1 DeviceSecurityCheckerUtil.kt\ncom/gse/aulapp/util/DeviceSecurityCheckerUtil\n*L\n82#1:93,2\n*E\n"})
/* loaded from: classes.dex */
public final class DeviceSecurityCheckerUtil {
    private final String TAG;
    private final Context context;

    public DeviceSecurityCheckerUtil(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.TAG = "DeviceSecurityChecker";
    }

    public final boolean isDebuggingEnabled() {
        return Settings.Secure.getInt(this.context.getContentResolver(), "adb_enabled", 0) != 0;
    }

    public final boolean isDeveloperModeEnabled() {
        return Settings.Secure.getInt(this.context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    public final boolean isEmulator() {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean startsWith$default3;
        boolean startsWith$default4;
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, "generic", false, 2, null);
        if (startsWith$default) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, "unknown", false, 2, null);
        if (startsWith$default2) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        contains$default = StringsKt.contains$default(MODEL, (CharSequence) "google_sdk", false, 2, (Object) null);
        if (contains$default) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        contains$default2 = StringsKt.contains$default(MODEL, (CharSequence) "Emulator", false, 2, (Object) null);
        if (contains$default2) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        contains$default3 = StringsKt.contains$default(MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null);
        if (contains$default3) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        contains$default4 = StringsKt.contains$default(MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null);
        if (contains$default4) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(BRAND, "generic", false, 2, null);
        if (startsWith$default3) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(DEVICE, "generic", false, 2, null);
            if (startsWith$default4) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }

    public final boolean isRooted() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        try {
        } catch (Exception e) {
            e.getMessage();
        }
        return new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"}).getInputStream())).readLine() != null;
    }

    public final Map<String, Boolean> validateDeviceSecurityChecker() {
        return MapsKt.mutableMapOf(TuplesKt.to(EnumDeviceSecurity.name$default(EnumDeviceSecurity.EMULATOR, null, 1, null), Boolean.valueOf(isEmulator())), TuplesKt.to(EnumDeviceSecurity.name$default(EnumDeviceSecurity.ROOTED, null, 1, null), Boolean.valueOf(isRooted())), TuplesKt.to(EnumDeviceSecurity.name$default(EnumDeviceSecurity.DEVELOPER_MODE_ENABLED, null, 1, null), Boolean.valueOf(isDeveloperModeEnabled())), TuplesKt.to(EnumDeviceSecurity.name$default(EnumDeviceSecurity.DEBUGGING_ENABLE, null, 1, null), Boolean.valueOf(isDebuggingEnabled())));
    }

    public final boolean validateMapDeviceSecurity() {
        Iterator<Map.Entry<String, Boolean>> it = validateDeviceSecurityChecker().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                z = true;
            }
        }
        return z;
    }
}
