package com.gse.aulapp.util;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.ContextCompat;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.util.ResourceUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ButtonUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ButtonUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/gse/aulapp/util/ButtonUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/google/android/material/button/MaterialButton;", "view", BuildConfig.FLAVOR, "normalColor", "pressedColor", "disabledColor", "borderNormalColor", "textNormalColor", BuildConfig.FLAVOR, "radius", "borderWidth", BuildConfig.FLAVOR, "isPrimaryButton", BuildConfig.FLAVOR, "makeSelector", "(Lcom/google/android/material/button/MaterialButton;IIIIIFIZ)V", BuildConfig.FLAVOR, "buttonText", "customPrimaryButton", "(Lcom/google/android/material/button/MaterialButton;Ljava/lang/String;)V", "complete", "customThirdButton", "(Lcom/google/android/material/button/MaterialButton;Ljava/lang/String;Z)V", "customFourthButton", "customFiveButton", "customSixButton", "TAG", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void makeSelector(MaterialButton view, int normalColor, int pressedColor, int disabledColor, int borderNormalColor, int textNormalColor, float radius, int borderWidth, boolean isPrimaryButton) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable mutate = new GradientDrawable().mutate();
            Intrinsics.checkNotNull(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) mutate;
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(radius);
            ResourceUtil.Companion companion = ResourceUtil.INSTANCE;
            gradientDrawable.setColor(companion.getColorResource(context, normalColor));
            if (!isPrimaryButton) {
                gradientDrawable.setStroke(borderWidth, companion.getColorResource(context, borderNormalColor));
            }
            gradientDrawable.invalidateSelf();
            Drawable mutate2 = new GradientDrawable().mutate();
            Intrinsics.checkNotNull(mutate2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable2 = (GradientDrawable) mutate2;
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(radius);
            gradientDrawable2.setColor(companion.getColorResource(context, isPrimaryButton ? pressedColor : normalColor));
            if (!isPrimaryButton) {
                gradientDrawable2.setStroke(borderWidth, companion.getColorResource(context, pressedColor));
            }
            gradientDrawable2.invalidateSelf();
            Drawable mutate3 = new GradientDrawable().mutate();
            Intrinsics.checkNotNull(mutate3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable3 = (GradientDrawable) mutate3;
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(radius);
            gradientDrawable3.setColor(companion.getColorResource(context, isPrimaryButton ? disabledColor : normalColor));
            if (!isPrimaryButton) {
                gradientDrawable3.setStroke(borderWidth, companion.getColorResource(context, disabledColor));
            }
            gradientDrawable3.invalidateSelf();
            StateListDrawable stateListDrawable = new StateListDrawable();
            int[][] iArr = {new int[]{R.attr.state_enabled, -16842919}, new int[]{R.attr.state_pressed}, new int[]{-16842910}};
            int[] iArr2 = {companion.getColorResource(context, borderNormalColor), companion.getColorResource(context, pressedColor), companion.getColorResource(context, disabledColor)};
            int[] iArr3 = {companion.getColorResource(context, normalColor), companion.getColorResource(context, normalColor), companion.getColorResource(context, normalColor)};
            ColorStateList colorStateList = new ColorStateList(iArr, iArr2);
            ColorStateList colorStateList2 = new ColorStateList(iArr, iArr3);
            stateListDrawable.addState(iArr[0], gradientDrawable);
            stateListDrawable.addState(iArr[1], gradientDrawable2);
            stateListDrawable.addState(iArr[2], gradientDrawable3);
            view.setRippleColorResource(com.gse.aulapp.R.color.transparent);
            if (isPrimaryButton) {
                view.setBackgroundTintList(colorStateList);
                view.setTextColor(ContextCompat.getColor(context, textNormalColor));
            } else {
                view.setBackgroundTintList(colorStateList2);
                view.setTextColor(colorStateList);
                view.setStrokeWidth(borderWidth);
                view.setStrokeColor(colorStateList2);
            }
        }

        public final void customFiveButton(MaterialButton view, String buttonText) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                makeSelector(view, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.dark_blue, 24.0f, 8, true);
                view.setText(buttonText);
            } catch (Exception unused) {
            }
        }

        public final void customFourthButton(MaterialButton view, String buttonText) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                makeSelector(view, com.gse.aulapp.R.color.dark_2_blue, com.gse.aulapp.R.color.dark_blue, com.gse.aulapp.R.color.dark_2_blue, com.gse.aulapp.R.color.dark_blue, com.gse.aulapp.R.color.secondary_button_normal, 24.0f, 8, true);
                view.setText(buttonText);
            } catch (Exception unused) {
            }
        }

        public final void customPrimaryButton(MaterialButton view, String buttonText) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                makeSelector(view, com.gse.aulapp.R.color.primary_button_normal, com.gse.aulapp.R.color.primary_button_pressed, com.gse.aulapp.R.color.primary_button_disabled, com.gse.aulapp.R.color.primary_button_border_normal, com.gse.aulapp.R.color.secondary_button_normal, 24.0f, 8, true);
                view.setText(buttonText);
            } catch (Exception e) {
                String unused = ButtonUtil.TAG;
                e.getMessage();
            }
        }

        public final void customSixButton(MaterialButton view, String buttonText) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                makeSelector(view, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.secondary_button_normal, com.gse.aulapp.R.color.dialog_container_error, 24.0f, 8, true);
                view.setText(buttonText);
            } catch (Exception unused) {
            }
        }

        public final void customThirdButton(MaterialButton view, String buttonText, boolean complete) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                makeSelector(view, com.gse.aulapp.R.color.secondary_button_normal, complete ? com.gse.aulapp.R.color.dialog_success_background : com.gse.aulapp.R.color.dialog_container_error, complete ? com.gse.aulapp.R.color.dialog_success_background : com.gse.aulapp.R.color.dialog_container_error, complete ? com.gse.aulapp.R.color.dialog_success_background : com.gse.aulapp.R.color.dialog_container_error, com.gse.aulapp.R.color.secondary_button_normal, 24.0f, 8, false);
                view.setText(buttonText);
            } catch (Exception unused) {
            }
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ButtonUtil", "getSimpleName(...)");
        TAG = "ButtonUtil";
    }
}
