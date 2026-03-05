package com.gse.aulapp.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import co.ceduladigital.sdk.q2;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.util.DialogUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/NavigationUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NavigationUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;
    private static NavController _navController;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/gse/aulapp/util/NavigationUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "TAG", BuildConfig.FLAVOR, "_navController", "Landroidx/navigation/NavController;", "navigateToDifferentFragment", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "navController", "action", "Landroidx/navigation/NavDirections;", "dialogEmulator", "Landroid/app/Activity;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void dialogEmulator$lambda$0(Activity context, View view) {
            Intrinsics.checkNotNullParameter(context, "$context");
            context.finish();
        }

        public final void dialogEmulator(Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, context, EnumDialogType.IS_EMULATOR_OR_DEVELOPER_MODE, null, null, null, false, new q2(context, 2), 24, null).show();
            } catch (Exception e) {
                String unused = NavigationUtil.TAG;
                e.toString();
            }
        }

        public final void navigateToDifferentFragment(Context context, NavController navController, NavDirections action) {
            NavController navController2;
            if (context == null) {
                String unused = NavigationUtil.TAG;
                return;
            }
            if (new DeviceSecurityCheckerUtil(context).validateMapDeviceSecurity()) {
                dialogEmulator((Activity) context);
                return;
            }
            NavigationUtil._navController = navController;
            if (action == null || NavigationUtil._navController == null || (navController2 = NavigationUtil._navController) == null) {
                return;
            }
            navController2.navigate(action);
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("NavigationUtil", "getSimpleName(...)");
        TAG = "NavigationUtil";
    }
}
