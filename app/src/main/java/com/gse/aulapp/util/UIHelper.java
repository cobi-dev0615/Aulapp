package com.gse.aulapp.util;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EParametersType;
import com.gse.aulapp.view.activity.PrincipalActivity;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/UIHelper;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class UIHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\rJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018Ja\u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/gse/aulapp/util/UIHelper$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", BuildConfig.FLAVOR, "lockDrawer", BuildConfig.FLAVOR, "lockSwipeGestureDrawerMenuOpened", "(Landroidx/drawerlayout/widget/DrawerLayout;Z)V", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;Z)V", "closeVirtualKeyboardActivity", "(Landroid/app/Activity;)V", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "left", "top", "right", "bottom", "setMargins", "(Landroid/view/View;IIII)V", "Landroidx/fragment/app/FragmentActivity;", "showToolbar", "showLogo", BuildConfig.FLAVOR, "title", "imageToolbar", "iconToolbar", "showActionLeftButton", "setterCustomToolbar", "(Landroidx/fragment/app/FragmentActivity;ZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)V", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void closeVirtualKeyboardActivity(Activity activity) {
            View currentFocus;
            if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
                return;
            }
            Object systemService = activity.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }

        private final void lockSwipeGestureDrawerMenuOpened(DrawerLayout drawerLayout, boolean lockDrawer) {
            drawerLayout.setDrawerLockMode(lockDrawer ? 1 : 0);
        }

        public static /* synthetic */ void setterCustomToolbar$default(Companion companion, FragmentActivity fragmentActivity, boolean z, boolean z2, String str, Integer num, Integer num2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            if ((i & 16) != 0) {
                num = null;
            }
            if ((i & 32) != 0) {
                num2 = null;
            }
            if ((i & 64) != 0) {
                z3 = true;
            }
            if ((i & 128) != 0) {
                z4 = true;
            }
            companion.setterCustomToolbar(fragmentActivity, z, z2, str, num, num2, z3, z4);
        }

        public final String getTAG() {
            return UIHelper.TAG;
        }

        public final void setMargins(View view, int left, int top, int right, int bottom) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                float f = view.getContext().getResources().getDisplayMetrics().density;
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) ((left * f) + 0.5f), (int) ((top * f) + 0.5f), (int) ((right * f) + 0.5f), (int) ((bottom * f) + 0.5f));
                view.requestLayout();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.appcompat.app.ActionBar] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence] */
        public final void setterCustomToolbar(FragmentActivity activity, boolean showToolbar, boolean showLogo, String title, Integer imageToolbar, Integer iconToolbar, boolean lockDrawer, boolean showActionLeftButton) {
            Object supportActionBar;
            Intrinsics.checkNotNullParameter(activity, "activity");
            closeVirtualKeyboardActivity(activity);
            getTAG();
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity.getSupportActionBar() == null || (supportActionBar = appCompatActivity.getSupportActionBar()) == 0) {
                return;
            }
            if (showToolbar) {
                if (!showLogo) {
                    supportActionBar.setLogo(null);
                } else if (imageToolbar != null) {
                    supportActionBar.setLogo(imageToolbar.intValue());
                } else {
                    ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
                    if (supportActionBar2 != null) {
                        supportActionBar2.setLogo(R.drawable.ic_aulapp);
                    }
                }
                if (title == 0) {
                    title = (CharSequence) Parameters.INSTANCE.getParameter(EParametersType.EMPTY);
                }
                supportActionBar.setTitle(title);
                supportActionBar.show();
            } else {
                supportActionBar.hide();
            }
            if (showActionLeftButton) {
                ActionBar supportActionBar3 = appCompatActivity.getSupportActionBar();
                if (supportActionBar3 != null) {
                    supportActionBar3.setDisplayHomeAsUpEnabled(true);
                }
                if (iconToolbar != null) {
                    ActionBar supportActionBar4 = appCompatActivity.getSupportActionBar();
                    if (supportActionBar4 != null) {
                        supportActionBar4.setHomeAsUpIndicator(iconToolbar.intValue());
                    }
                } else {
                    ActionBar supportActionBar5 = appCompatActivity.getSupportActionBar();
                    if (supportActionBar5 != null) {
                        supportActionBar5.setHomeAsUpIndicator(R.drawable.ic_arrow_back);
                    }
                }
            } else {
                ActionBar supportActionBar6 = appCompatActivity.getSupportActionBar();
                if (supportActionBar6 != null) {
                    supportActionBar6.setDisplayHomeAsUpEnabled(false);
                }
                ActionBar supportActionBar7 = appCompatActivity.getSupportActionBar();
                if (supportActionBar7 != null) {
                    supportActionBar7.setHomeButtonEnabled(false);
                }
                ActionBar supportActionBar8 = appCompatActivity.getSupportActionBar();
                if (supportActionBar8 != null) {
                    supportActionBar8.setHomeAsUpIndicator((Drawable) null);
                }
            }
            UIHelper.INSTANCE.lockSwipeGestureDrawerMenuOpened(activity, lockDrawer);
        }

        private Companion() {
        }

        private final void lockSwipeGestureDrawerMenuOpened(Activity activity, boolean lockDrawer) {
            if (activity instanceof PrincipalActivity) {
                lockSwipeGestureDrawerMenuOpened(((PrincipalActivity) activity).getDrawerLayout(), lockDrawer);
            }
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("UIHelper", "getSimpleName(...)");
        TAG = "UIHelper";
    }
}
