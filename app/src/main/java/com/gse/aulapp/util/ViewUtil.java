package com.gse.aulapp.util;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import co.ceduladigital.sdk.r;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ViewUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ViewUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/gse/aulapp/util/ViewUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "DEFAULT_TIME_DELAY", BuildConfig.FLAVOR, "TAG", BuildConfig.FLAVOR, "getTAG", "()Ljava/lang/String;", "preventDoubleClick", BuildConfig.FLAVOR, "view", "Landroid/view/View;", "calculateNoOfColumns", "resources", "Landroid/content/res/Resources;", "columnWidthDp", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void preventDoubleClick$lambda$0(View view) {
            Intrinsics.checkNotNullParameter(view, "$view");
            view.setEnabled(true);
        }

        public final int calculateNoOfColumns(Resources resources, float columnWidthDp) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return (int) (((displayMetrics.widthPixels / displayMetrics.density) / columnWidthDp) + 0.5d);
        }

        public final String getTAG() {
            return ViewUtil.TAG;
        }

        public final void preventDoubleClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                view.setEnabled(false);
                new Handler(Looper.getMainLooper()).postDelayed(new r(view, 1), 1500L);
            } catch (Exception unused) {
                getTAG();
            }
        }

        private Companion() {
        }
    }

    static {
        String canonicalName = ViewUtil.class.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        TAG = canonicalName;
    }
}
