package com.gse.aulapp.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.provider.Settings;
import com.gse.aulapp.util.BroadcastUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/BroadcastUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BroadcastUtil {
    private static boolean airplaneModeEnabled;
    private static boolean gpsEnabled;
    private static boolean isReceiverRegistered;
    private static int levelGPS;
    private static BroadcastReceiver receiver;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final IntentFilter FILTER_AIRPLANE = new IntentFilter("android.intent.action.AIRPLANE_MODE");
    private static final IntentFilter FILTER_GPS = new IntentFilter("android.location.PROVIDERS_CHANGED");
    private static final IntentFilter FILTER_BLUETOOTH = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    private static final IntentFilter FILTER_WIFI = new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED");
    private static final IntentFilter FILTER_NFC = new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED");

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010%\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/gse/aulapp/util/BroadcastUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "status", BuildConfig.FLAVOR, "callback", "initBroadCast", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Intent;", "intent", "handlerStateChangeNfc", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "handlerChangeStateGps", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/IntentFilter;", "filter", "startReceiver", "(Landroid/content/Context;Landroid/content/IntentFilter;Lkotlin/jvm/functions/Function1;)V", "stopReceiver", "(Landroid/content/Context;)V", "isAirplaneMode", "(Landroid/content/Context;)Z", "isGPSEnabled", "isNfcEnabled", "FILTER_AIRPLANE", "Landroid/content/IntentFilter;", "getFILTER_AIRPLANE", "()Landroid/content/IntentFilter;", "FILTER_GPS", "getFILTER_GPS", "FILTER_NFC", "getFILTER_NFC", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/BroadcastReceiver;", "isReceiverRegistered", "Z", "gpsEnabled", "airplaneModeEnabled", BuildConfig.FLAVOR, "levelGPS", "I", BuildConfig.FLAVOR, "STATE", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlerChangeStateGps(Context context, Function1<? super Boolean, Unit> callback) {
            BroadcastUtil.levelGPS++;
            Object systemService = context.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            BroadcastUtil.gpsEnabled = ((LocationManager) systemService).isProviderEnabled("gps");
            if (BroadcastUtil.levelGPS == 3) {
                BroadcastUtil.levelGPS = 0;
                callback.invoke(Boolean.valueOf(BroadcastUtil.gpsEnabled));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlerStateChangeNfc(Intent intent, Function1<? super Boolean, Unit> callback) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
            if (intExtra == 1) {
                callback.invoke(Boolean.FALSE);
            } else {
                if (intExtra != 3) {
                    return;
                }
                callback.invoke(Boolean.TRUE);
            }
        }

        private final void initBroadCast(final Function1<? super Boolean, Unit> callback) {
            BroadcastUtil.receiver = new BroadcastReceiver() { // from class: com.gse.aulapp.util.BroadcastUtil$Companion$initBroadCast$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1184851779) {
                            if (action.equals("android.location.PROVIDERS_CHANGED")) {
                                BroadcastUtil.INSTANCE.handlerChangeStateGps(context, callback);
                            }
                        } else {
                            if (hashCode != -1076576821) {
                                if (hashCode == 1943044864 && action.equals("android.nfc.action.ADAPTER_STATE_CHANGED")) {
                                    BroadcastUtil.INSTANCE.handlerStateChangeNfc(intent, callback);
                                    return;
                                }
                                return;
                            }
                            if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                                BroadcastUtil.Companion companion = BroadcastUtil.INSTANCE;
                                BroadcastUtil.airplaneModeEnabled = intent.getBooleanExtra("state", false);
                                Function1<Boolean, Unit> function1 = (Function1<Boolean, Unit>) (Function1<?, ?>) callback;
                                z = BroadcastUtil.airplaneModeEnabled;
                                function1.invoke(Boolean.valueOf(z));
                            }
                        }
                    }
                }
            };
        }

        public final IntentFilter getFILTER_AIRPLANE() {
            return BroadcastUtil.FILTER_AIRPLANE;
        }

        public final IntentFilter getFILTER_GPS() {
            return BroadcastUtil.FILTER_GPS;
        }

        public final IntentFilter getFILTER_NFC() {
            return BroadcastUtil.FILTER_NFC;
        }

        public final boolean isAirplaneMode(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        }

        public final boolean isGPSEnabled(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return GpsUtil.INSTANCE.isGpsEnabled(context);
        }

        public final boolean isNfcEnabled(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return NfcUtil.INSTANCE.isEnabledNfc(context);
        }

        public final void startReceiver(Context context, IntentFilter filter, Function1<? super Boolean, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (BroadcastUtil.isReceiverRegistered) {
                return;
            }
            initBroadCast(callback);
            BroadcastReceiver broadcastReceiver = BroadcastUtil.receiver;
            if (broadcastReceiver != null) {
                context.registerReceiver(broadcastReceiver, filter);
                BroadcastUtil.isReceiverRegistered = true;
            }
        }

        public final void stopReceiver(Context context) {
            if (!BroadcastUtil.isReceiverRegistered || BroadcastUtil.receiver == null || context == null) {
                return;
            }
            try {
                context.unregisterReceiver(BroadcastUtil.receiver);
            } catch (Exception e) {
                e.getMessage();
            } finally {
                BroadcastUtil.isReceiverRegistered = false;
                BroadcastUtil.receiver = null;
            }
        }

        private Companion() {
        }
    }
}
