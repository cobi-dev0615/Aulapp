package com.gse.aulapp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import co.ceduladigital.sdk.j3;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.o1;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.q2;
import co.ceduladigital.sdk.y5;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.service.LocationService;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.GpsUtil;
import com.karumi.dexter.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/GpsUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class GpsUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    static final String TAG = "GpsUtil";
    private static AlertDialog alertDialog;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\r2\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0018J'\u0010$\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\u0015J'\u0010&\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u000fJ\u0017\u0010'\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\u0018J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J;\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dH\u0002¢\u0006\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00102¨\u00065"}, d2 = {"Lcom/gse/aulapp/util/GpsUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "getDateTime", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/app/Activity;", BuildConfig.FLAVOR, "interval", "sessionId", BuildConfig.FLAVOR, "validatePermissionsAndStart", "(Landroid/app/Activity;JLjava/lang/String;)V", "Lkotlin/Function0;", "function", "validatePermission", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "stopGps", "(Landroid/app/Activity;)V", BuildConfig.FLAVOR, "isGpsEnabled", "(Landroid/content/Context;)Z", "Lkotlin/Function1;", "callback", "locationEnabled", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "coordinates", "traceRouteOnMaps", "(Ljava/util/List;Landroid/content/Context;)V", "validateGpsIsActive", "validateHardwareAndGpsTurnOn", "openSettingsGps", "startGps", "hasGpsHardware", "Landroid/location/Location;", "location", "isMockLocationEnabled", "(Landroid/location/Location;)Z", "filterRoutes", "(Ljava/util/List;)Ljava/util/List;", "Landroid/app/AlertDialog;", "alertDialog", "Landroid/app/AlertDialog;", "TAG", "Ljava/lang/String;", "REPLACE_LAT_KEY", "REPLACE_LONG_KEY", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGpsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsUtil.kt\ncom/gse/aulapp/util/GpsUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,454:1\n1557#2:455\n1628#2,3:456\n1557#2:459\n1628#2,3:460\n*S KotlinDebug\n*F\n+ 1 GpsUtil.kt\ncom/gse/aulapp/util/GpsUtil$Companion\n*L\n391#1:455\n391#1:456,3\n392#1:459\n392#1:460,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Pair<Double, Double>> filterRoutes(List<Pair<Double, Double>> coordinates) {
            ArrayList arrayList = new ArrayList();
            if (coordinates.size() < 11) {
                return coordinates;
            }
            arrayList.add(coordinates.get(0));
            Pair<Double, Double> pair = coordinates.get(coordinates.size() - 1);
            int floor = (int) Math.floor((coordinates.size() - 1) / 9.0d);
            for (int i = 1; i < 10; i++) {
                arrayList.add(coordinates.get(i * floor));
            }
            arrayList.add(pair);
            return arrayList;
        }

        private final boolean hasGpsHardware(Context context) {
            return context.getPackageManager().hasSystemFeature("android.hardware.location.gps");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isMockLocationEnabled(Location location) {
            boolean isMock;
            if (Build.VERSION.SDK_INT < 31) {
                return location.isFromMockProvider();
            }
            isMock = location.isMock();
            return isMock;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit locationEnabled$lambda$13(final Function1 callback, final FusedLocationProviderClient fusedLocationProviderClient, Location location) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(fusedLocationProviderClient, "$fusedLocationProviderClient");
            if (location != null) {
                callback.invoke(Boolean.valueOf(GpsUtil.INSTANCE.isMockLocationEnabled(location)));
            } else {
                LocationRequest.Builder builder = new LocationRequest.Builder(100, 5000L);
                builder.setWaitForAccurateLocation(true);
                builder.setMinUpdateIntervalMillis(0L);
                builder.setMaxUpdateDelayMillis(0L);
                builder.setMaxUpdates(1);
                LocationRequest build = builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                fusedLocationProviderClient.requestLocationUpdates(build, new LocationCallback() { // from class: com.gse.aulapp.util.GpsUtil$Companion$locationEnabled$1$locationCallback$1
                    @Override // com.google.android.gms.location.LocationCallback
                    public void onLocationResult(LocationResult locationResult) {
                        boolean isMockLocationEnabled;
                        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                        Location lastLocation = locationResult.getLastLocation();
                        if (lastLocation != null) {
                            Function1<Boolean, Unit> function1 = callback;
                            isMockLocationEnabled = GpsUtil.INSTANCE.isMockLocationEnabled(lastLocation);
                            function1.invoke(Boolean.valueOf(isMockLocationEnabled));
                        } else {
                            callback.invoke(Boolean.FALSE);
                        }
                        fusedLocationProviderClient.removeLocationUpdates(this);
                    }
                }, Looper.getMainLooper());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void locationEnabled$lambda$14(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void locationEnabled$lambda$15(Function1 callback, Exception it) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(it, "it");
            callback.invoke(Boolean.FALSE);
        }

        private final void openSettingsGps(Activity context) {
            context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }

        private final void startGps(final Activity context, final long interval, final String sessionId) {
            if (context.isFinishing() || context.isDestroyed()) {
                String unused = GpsUtil.TAG;
                return;
            }
            try {
                locationEnabled(context, new Function1() { // from class: co.ceduladigital.sdk.z5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit startGps$lambda$10;
                        startGps$lambda$10 = GpsUtil.Companion.startGps$lambda$10(context, interval, sessionId, ((Boolean) obj).booleanValue());
                        return startGps$lambda$10;
                    }
                });
            } catch (Exception unused2) {
                String unused3 = GpsUtil.TAG;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit startGps$lambda$10(Activity context, long j, String sessionId, boolean z) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(sessionId, "$sessionId");
            String unused = GpsUtil.TAG;
            if (z) {
                DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, context, EnumDialogType.DIALOG_FAKE_GPS, new y5(context, j, sessionId, 2), null, 8, null);
            } else {
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) LocationService.class);
                intent.setAction("ACTION_START");
                intent.putExtra("INTERVAL_KEY", j);
                intent.putExtra("SESSION_ID_KEY", sessionId);
                context.startService(intent);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit startGps$lambda$10$lambda$8(Activity context, long j, String sessionId) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(sessionId, "$sessionId");
            GpsUtil.INSTANCE.startGps(context, j, sessionId);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateHardwareAndGpsTurnOn(Activity context, Function0<Unit> function) {
            try {
                if (!hasGpsHardware(context)) {
                    String unused = GpsUtil.TAG;
                    return;
                }
                String unused2 = GpsUtil.TAG;
                if (BroadcastUtil.INSTANCE.isGPSEnabled(context)) {
                    function.invoke();
                    return;
                }
                String unused3 = GpsUtil.TAG;
                GpsUtil.alertDialog = DialogUtil.INSTANCE.showInformationFullDialogError(context, context.getString(R.string.title_gps_turn_off), context.getString(R.string.message_gps_turn_off), false, context.getString(R.string.title_btn_go_to_settings_gps), context.getString(R.string.title_btn_cancel_gps), Integer.valueOf(R.drawable.ic_warning_2_type), new q2(context, 1), new k1(4));
                AlertDialog alertDialog = GpsUtil.alertDialog;
                if (alertDialog != null) {
                    alertDialog.show();
                }
            } catch (Exception e) {
                String unused4 = GpsUtil.TAG;
                e.getMessage();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void validateHardwareAndGpsTurnOn$lambda$6(Activity context, View view) {
            Intrinsics.checkNotNullParameter(context, "$context");
            GpsUtil.INSTANCE.openSettingsGps(context);
            AlertDialog alertDialog = GpsUtil.alertDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void validateHardwareAndGpsTurnOn$lambda$7(View view) {
            AlertDialog alertDialog = GpsUtil.alertDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit validatePermissionsAndStart$lambda$4(Activity context, long j, String sessionId) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(sessionId, "$sessionId");
            GpsUtil.INSTANCE.validatePermission(context, new y5(context, j, sessionId, 1));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit validatePermissionsAndStart$lambda$4$lambda$3(Activity context, long j, String sessionId) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(sessionId, "$sessionId");
            GpsUtil.INSTANCE.startGps(context, j, sessionId);
            return Unit.INSTANCE;
        }

        public final String getDateTime(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                ActivityCompat.requestPermissions((Activity) context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 123);
                return BuildConfig.FLAVOR;
            }
            Object systemService = context.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            Location lastKnownLocation = ((LocationManager) systemService).getLastKnownLocation("gps");
            if (lastKnownLocation == null) {
                return BuildConfig.FLAVOR;
            }
            Date date = new Date(lastKnownLocation.getTime());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
            String format = simpleDateFormat.format(date);
            String format2 = simpleDateFormat2.format(date);
            String str = format + " " + format2;
            format.toString();
            format2.toString();
            return str;
        }

        public final boolean isGpsEnabled(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            return ((LocationManager) systemService).isProviderEnabled("gps");
        }

        public final void locationEnabled(Context context, Function1<? super Boolean, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            try {
                if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.FOREGROUND_SERVICE_LOCATION") == 0) {
                    Intrinsics.checkNotNull(fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new j3(new o1(callback, fusedLocationProviderClient, 2), 6)).addOnFailureListener(new j3(callback, 7)));
                } else {
                    callback.invoke(Boolean.FALSE);
                }
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(context, q.i("locationEnabled exception: ", e.getMessage()), "locationEnabled", true);
                String unused = GpsUtil.TAG;
                e.getMessage();
                callback.invoke(Boolean.FALSE);
            }
        }

        public final void stopGps(Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) LocationService.class);
            intent.setAction("ACTION_STOP");
            context.startService(intent);
        }

        public final void traceRouteOnMaps(List<Pair<Double, Double>> coordinates, Context context) {
            List drop;
            List drop2;
            List zip;
            String joinedString;
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(context, "context");
            List<Pair<Double, Double>> filterRoutes = filterRoutes(coordinates);
            ArrayList arrayList = new ArrayList(10);
            Iterator<?> it = filterRoutes.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((Number) ((Pair) it.next()).getFirst()).doubleValue()));
            }
            ArrayList arrayList2 = new ArrayList(10);
            Iterator<?> it2 = filterRoutes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(((Number) ((Pair) it2.next()).getSecond()).doubleValue()));
            }
            Object first = CollectionsKt.first((List<? extends Object>) arrayList);
            Object first2 = CollectionsKt.first((List<? extends Object>) arrayList2);
            Object last = CollectionsKt.last((List<? extends Object>) arrayList);
            Object last2 = CollectionsKt.last((List<? extends Object>) arrayList2);
            drop = CollectionsKt.drop(arrayList, 1);
            drop2 = CollectionsKt.drop(arrayList2, 1);
            zip = CollectionsKt.zip(drop, drop2);
            joinedString = CollectionsKt.joinToString(zip, (CharSequence) "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, null);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/dir/?api=1&travelmode=driving&origin=" + first + "," + first2 + "&destination=" + last + "," + last2 + "&waypoints=" + joinedString));
            intent.setPackage("com.google.android.apps.maps");
            Intent createChooser = Intent.createChooser(new Intent(), "Mostrar ruta con...");
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            if (createChooser.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(createChooser);
            }
        }

        public final boolean validateGpsIsActive(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            LocationManager locationManager = (LocationManager) systemService;
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }

        public final void validatePermission(Activity context, Function0<Unit> function) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(function, "function");
            PermissionHelper.INSTANCE.requestLocationPermission(context, 2, new GpsUtil$Companion$validatePermission$1(context, function));
        }

        public final void validatePermissionsAndStart(Activity context, long interval, String sessionId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            validateHardwareAndGpsTurnOn(context, new y5(context, interval, sessionId, 0));
        }

        private Companion() {
        }
    }
}
