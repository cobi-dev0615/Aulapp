package com.gse.aulapp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.r2;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enums.EnumPermissionDevices;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.PermissionHelper$Companion$requestPermission$1;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/gse/aulapp/util/PermissionHelper$Companion$requestPermission$1", "Lcom/karumi/dexter/listener/single/PermissionListener;", "onPermissionGranted", BuildConfig.FLAVOR, "response", "Lcom/karumi/dexter/listener/PermissionGrantedResponse;", "onPermissionDenied", "Lcom/karumi/dexter/listener/PermissionDeniedResponse;", "onPermissionRationaleShouldBeShown", "permission", "Lcom/karumi/dexter/listener/PermissionRequest;", "token", "Lcom/karumi/dexter/PermissionToken;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PermissionHelper$Companion$requestPermission$1 implements PermissionListener {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ PermissionHelper.Companion.PermissionGrantedListener $listener;
    final /* synthetic */ String $permission;
    final /* synthetic */ String $rationaleMsg;
    final /* synthetic */ int $type;

    public PermissionHelper$Companion$requestPermission$1(PermissionHelper.Companion.PermissionGrantedListener permissionGrantedListener, Activity activity, String str, int i, String str2) {
        this.$listener = permissionGrantedListener;
        this.$activity = activity;
        this.$permission = str;
        this.$type = i;
        this.$rationaleMsg = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionDenied$lambda$0(PermissionHelper.Companion.PermissionGrantedListener listener, View view) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        AlertDialog alertDialog = PermissionHelper.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        listener.onPermissionCancel(EnumPermissionDevices.CAMERA_FINGER_PERMISSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionDenied$lambda$1(PermissionHelper.Companion.PermissionGrantedListener listener, View view) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        AlertDialog alertDialog = PermissionHelper.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        listener.onPermissionCancel(EnumPermissionDevices.CAMERA_FACE_PERMISSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionDenied$lambda$2(View view) {
        AlertDialog alertDialog = PermissionHelper.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionRationaleShouldBeShown$lambda$3(PermissionToken token, View view) {
        Intrinsics.checkNotNullParameter(token, "$token");
        token.continuePermissionRequest();
        AlertDialog alertDialog = PermissionHelper.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(PermissionDeniedResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isPermanentlyDenied()) {
            PermissionHelper.Companion.showDialogActivatePermissionManually$default(PermissionHelper.INSTANCE, this.$activity, null, null, 6, null);
            return;
        }
        if (!Intrinsics.areEqual("android.permission.CAMERA", this.$permission)) {
            if (Intrinsics.areEqual("android.permission.ACCESS_FINE_LOCATION", this.$permission) && this.$type == 2) {
                PermissionHelper.Companion companion = PermissionHelper.INSTANCE;
                Activity activity = this.$activity;
                String string = activity.getString(R.string.permission_troubleshooting_gps);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                PermissionHelper.Companion.showDialog$default(companion, activity, null, string, new k1(7), 2, null);
                return;
            }
            return;
        }
        int i = this.$type;
        if (i == 0) {
            PermissionHelper.Companion companion2 = PermissionHelper.INSTANCE;
            Activity activity2 = this.$activity;
            String string2 = activity2.getString(R.string.permission_troubleshooting_camera_finger);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            final PermissionHelper.Companion.PermissionGrantedListener permissionGrantedListener = this.$listener;
            final int i2 = 0;
            PermissionHelper.Companion.showDialog$default(companion2, activity2, null, string2, new View.OnClickListener() { // from class: co.ceduladigital.sdk.g7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            PermissionHelper$Companion$requestPermission$1.onPermissionDenied$lambda$0(permissionGrantedListener, view);
                            break;
                        default:
                            PermissionHelper$Companion$requestPermission$1.onPermissionDenied$lambda$1(permissionGrantedListener, view);
                            break;
                    }
                }
            }, 2, null);
            return;
        }
        if (i == 1) {
            PermissionHelper.Companion companion3 = PermissionHelper.INSTANCE;
            Activity activity3 = this.$activity;
            String string3 = activity3.getString(R.string.permission_troubleshooting_camera_face);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            final PermissionHelper.Companion.PermissionGrantedListener permissionGrantedListener2 = this.$listener;
            final int i3 = 1;
            PermissionHelper.Companion.showDialog$default(companion3, activity3, null, string3, new View.OnClickListener() { // from class: co.ceduladigital.sdk.g7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            PermissionHelper$Companion$requestPermission$1.onPermissionDenied$lambda$0(permissionGrantedListener2, view);
                            break;
                        default:
                            PermissionHelper$Companion$requestPermission$1.onPermissionDenied$lambda$1(permissionGrantedListener2, view);
                            break;
                    }
                }
            }, 2, null);
        }
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(PermissionGrantedResponse response) {
        this.$listener.onPermissionGranted();
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
        Intrinsics.checkNotNullParameter(token, "token");
        PermissionHelper.Companion.showDialog$default(PermissionHelper.INSTANCE, this.$activity, null, this.$rationaleMsg, new r2(token, 10), 2, null);
    }
}
