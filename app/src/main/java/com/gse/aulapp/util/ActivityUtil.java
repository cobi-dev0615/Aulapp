package com.gse.aulapp.util;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.karumi.dexter.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ActivityUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ActivityUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ActivityUtil";

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/util/ActivityUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "currentActivity", "Ljava/lang/Class;", "destinationActivity", BuildConfig.FLAVOR, "finish", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "params", BuildConfig.FLAVOR, "navigateToActivity", "(Landroid/app/Activity;Ljava/lang/Class;ZLjava/util/Map;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "Landroidx/fragment/app/Fragment;", "getCurrentFragmentFromActivity", "(Landroidx/fragment/app/FragmentActivity;)Landroidx/fragment/app/Fragment;", "TAG", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nActivityUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityUtil.kt\ncom/gse/aulapp/util/ActivityUtil$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment getCurrentFragmentFromActivity(FragmentActivity activity) {
            Object obj;
            FragmentManager childFragmentManager;
            List<Fragment> fragments;
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                List<Fragment> fragments2 = activity.getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
                Iterator<?> it = fragments2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Fragment) obj) instanceof NavHostFragment) {
                        break;
                    }
                }
                Fragment fragment = (Fragment) obj;
                if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (fragments = childFragmentManager.getFragments()) != null) {
                    return (Fragment) CollectionsKt.last((List) fragments);
                }
            } catch (Exception unused) {
                String unused2 = ActivityUtil.TAG;
            }
            return null;
        }

        public final void navigateToActivity(Activity currentActivity, Class<?> destinationActivity, boolean finish, Map<String, String> params) {
            Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
            Intrinsics.checkNotNullParameter(destinationActivity, "destinationActivity");
            Intrinsics.checkNotNullParameter(params, "params");
            if (new DeviceSecurityCheckerUtil(currentActivity).validateMapDeviceSecurity()) {
                NavigationUtil.INSTANCE.dialogEmulator(currentActivity);
                return;
            }
            Intent intent = new Intent(currentActivity, destinationActivity);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
            currentActivity.startActivity(intent);
            if (finish) {
                currentActivity.finish();
            }
        }

        private Companion() {
        }
    }
}
