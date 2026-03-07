package com.gse.aulapp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import co.ceduladigital.sdk.f0;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.q2;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enums.EnumPermissionDevices;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.Dexter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/PermissionHelper;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PermissionHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    static AlertDialog alertDialog;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010 J'\u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b%\u0010$J#\u0010(\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0&¢\u0006\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00101\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010.¨\u00063"}, d2 = {"Lcom/gse/aulapp/util/PermissionHelper$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "activity", BuildConfig.FLAVOR, "type", "Lcom/gse/aulapp/util/PermissionHelper$Companion$PermissionGrantedListener;", "listener", BuildConfig.FLAVOR, "permission", "rationaleMsg", "permanentDeniedMsg", BuildConfig.FLAVOR, "requestPermission", "(Landroid/app/Activity;ILcom/gse/aulapp/util/PermissionHelper$Companion$PermissionGrantedListener;Ljava/lang/String;Ljava/lang/String;I)V", "context", "title", "showDialogActivatePermissionManually", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "listenerOk", "showDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "Landroid/content/Context;", BuildConfig.FLAVOR, "isNotificationPermissionGranted", "(Landroid/content/Context;)Z", "requestNotificationPermission", "(Landroid/app/Activity;Landroid/view/View$OnClickListener;)V", "openSettingsPermission", "(Landroid/app/Activity;)V", "openNotificationSettings", "handleNotificationPermissionApi33", "requestCameraPermission", "(Landroid/app/Activity;ILcom/gse/aulapp/util/PermissionHelper$Companion$PermissionGrantedListener;)V", "requestLocationPermission", "Lkotlin/Function0;", "function", "validateNotificationPermissionFlow", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "Landroid/app/AlertDialog;", "alertDialog", "Landroid/app/AlertDialog;", "DIALOG_TYPE_FINGER", "I", "DIALOG_TYPE_FACE", "DIALOG_TYPE_GPS", "DIALOG_TYPE_NOTIFICATION", "PermissionGrantedListener", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/util/PermissionHelper$Companion$PermissionGrantedListener;", BuildConfig.FLAVOR, "onPermissionGranted", BuildConfig.FLAVOR, "onPermissionCancel", "device", "Lcom/gse/aulapp/model/enums/EnumPermissionDevices;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface PermissionGrantedListener {
            void onPermissionCancel(EnumPermissionDevices device);

            void onPermissionGranted();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void handleNotificationPermissionApi33(Activity context) {
            if (Build.VERSION.SDK_INT >= 33) {
                requestNotificationPermission$default(this, context, null, 2, null);
            }
        }

        private final boolean isNotificationPermissionGranted(Context context) {
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        }

        private final void openNotificationSettings(Activity activity) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            activity.startActivity(intent);
        }

        private final void openSettingsPermission(Activity context) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        }

        private final void requestNotificationPermission(Activity activity, View.OnClickListener listenerOk) {
            if (isNotificationPermissionGranted(activity)) {
                if (listenerOk != null) {
                    listenerOk.onClick(null);
                }
            } else {
                String string = activity.getString(R.string.dialog_notification_permission_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = activity.getString(R.string.dialog_notification_permission_message);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                showDialog(activity, string, string2, new f0(activity, listenerOk, 7));
            }
        }

        public static /* synthetic */ void requestNotificationPermission$default(Companion companion, Activity activity, View.OnClickListener onClickListener, int i, Object obj) {
            if ((i & 2) != 0) {
                onClickListener = null;
            }
            companion.requestNotificationPermission(activity, onClickListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void requestNotificationPermission$lambda$2(Activity activity, View.OnClickListener onClickListener, View view) {
            Intrinsics.checkNotNullParameter(activity, "$activity");
            PermissionHelper.INSTANCE.openNotificationSettings(activity);
            if (onClickListener != null) {
                onClickListener.onClick(null);
            }
            AlertDialog alertDialog = PermissionHelper.alertDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }

        private final void requestPermission(Activity activity, int type, PermissionGrantedListener listener, String permission, String rationaleMsg, int permanentDeniedMsg) {
            Dexter.withContext(activity).withPermission(permission).withListener(new PermissionHelper$Companion$requestPermission$1(listener, activity, permission, type, rationaleMsg)).check();
        }

        private final void showDialog(Activity activity, String title, String rationaleMsg, View.OnClickListener listenerOk) {
            PermissionHelper.alertDialog = DialogUtil.INSTANCE.showInformationFullDialogPermission(activity, title, rationaleMsg, EnumDialogType.DIALOG_TYPE_REQUEST_PERMISSION, false, true, listenerOk);
            AlertDialog alertDialog = PermissionHelper.alertDialog;
            if (alertDialog != null) {
                alertDialog.show();
            }
        }

        public static /* synthetic */ void showDialog$default(Companion companion, Activity activity, String str, String str2, View.OnClickListener onClickListener, int i, Object obj) {
            if ((i & 2) != 0) {
                str = activity.getString(R.string.dialog_fullscreen_title_permission);
            }
            if ((i & 8) != 0) {
                onClickListener = null;
            }
            companion.showDialog(activity, str, str2, onClickListener);
        }

        private final void showDialogActivatePermissionManually(Activity context, String title, String rationaleMsg) {
            PermissionHelper.alertDialog = DialogUtil.INSTANCE.showInformationFullDialogError(context, title, rationaleMsg, false, context.getString(R.string.title_btn_go_to_settings_permissions), context.getString(R.string.title_btn_cancel_permanently_denied), Integer.valueOf(R.drawable.ic_warning_2_type), new q2(context, 3), new k1(6));
            AlertDialog alertDialog = PermissionHelper.alertDialog;
            if (alertDialog != null) {
                alertDialog.show();
            }
        }

        public static /* synthetic */ void showDialogActivatePermissionManually$default(Companion companion, Activity activity, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = activity.getString(R.string.title_permanently_denied);
            }
            if ((i & 4) != 0) {
                str2 = activity.getString(R.string.message_permanently_denied);
            }
            companion.showDialogActivatePermissionManually(activity, str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showDialogActivatePermissionManually$lambda$0(Activity context, View view) {
            Intrinsics.checkNotNullParameter(context, "$context");
            PermissionHelper.INSTANCE.openSettingsPermission(context);
            AlertDialog alertDialog = PermissionHelper.alertDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showDialogActivatePermissionManually$lambda$1(View view) {
            AlertDialog alertDialog = PermissionHelper.alertDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }

        public final void requestCameraPermission(Activity activity, int type, PermissionGrantedListener listener) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(listener, "listener");
            String string = type == 0 ? activity.getString(R.string.permission_request_camera_finger) : activity.getString(R.string.permission_request_camera_face);
            Intrinsics.checkNotNull(string);
            requestPermission(activity, type, listener, "android.permission.CAMERA", string, type == 0 ? R.string.permission_permanently_denied_camera_finger : R.string.permission_permanently_denied_camera_face);
        }

        public final void requestLocationPermission(Activity activity, int type, PermissionGrantedListener listener) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(listener, "listener");
            String string = activity.getString(R.string.permission_request_location);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            requestPermission(activity, type, listener, "android.permission.ACCESS_FINE_LOCATION", string, R.string.permission_permanently_denied_location);
        }

        public final void validateNotificationPermissionFlow(Activity activity, Function0<Unit> function) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(function, "function");
            if (Build.VERSION.SDK_INT < 33) {
                function.invoke();
            } else if (ContextCompat.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
                function.invoke();
            } else {
                handleNotificationPermissionApi33(activity);
            }
        }

        private Companion() {
        }
    }
}
