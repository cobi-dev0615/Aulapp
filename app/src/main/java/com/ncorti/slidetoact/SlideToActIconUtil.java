package com.ncorti.slidetoact;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import co.ceduladigital.sdk.k;
import com.karumi.dexter.BuildConfig;
import com.ncorti.slidetoact.SlideToActIconUtil;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0017J\u001d\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/ncorti/slidetoact/SlideToActIconUtil;", BuildConfig.FLAVOR, "()V", "createIconAnimator", "Landroid/animation/ValueAnimator;", "view", "Lcom/ncorti/slidetoact/SlideToActView;", "icon", "Landroid/graphics/drawable/Drawable;", "listener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "fallbackToFadeAnimation", BuildConfig.FLAVOR, "loadIconCompat", "context", "Landroid/content/Context;", "value", BuildConfig.FLAVOR, "loadIconCompat$slidetoact_release", "startIconAnimation", BuildConfig.FLAVOR, "startIconAnimation$slidetoact_release", "stopIconAnimation", "stopIconAnimation$slidetoact_release", "tintIconCompat", "color", "tintIconCompat$slidetoact_release", "slidetoact_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SlideToActIconUtil {
    public static final SlideToActIconUtil INSTANCE = new SlideToActIconUtil();

    private SlideToActIconUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createIconAnimator$lambda-0, reason: not valid java name */
    public static final void m19createIconAnimator$lambda0(Drawable icon, SlideToActView view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(icon, "$icon");
        Intrinsics.checkNotNullParameter(view, "$view");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        icon.setAlpha(((Integer) animatedValue).intValue());
        view.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createIconAnimator$lambda-1, reason: not valid java name */
    public static final void m20createIconAnimator$lambda1(Ref.BooleanRef startedOnce, Drawable icon, SlideToActView view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(startedOnce, "$startedOnce");
        Intrinsics.checkNotNullParameter(icon, "$icon");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (startedOnce.element) {
            return;
        }
        INSTANCE.startIconAnimation$slidetoact_release(icon);
        view.invalidate();
        startedOnce.element = true;
    }

    private final boolean fallbackToFadeAnimation(Drawable icon) {
        return !(icon instanceof AnimatedVectorDrawable);
    }

    public final ValueAnimator createIconAnimator(final SlideToActView view, final Drawable icon, ValueAnimator.AnimatorUpdateListener listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (fallbackToFadeAnimation(icon)) {
            ValueAnimator tickAnimator = ValueAnimator.ofInt(0, KotlinVersion.MAX_COMPONENT_VALUE);
            tickAnimator.addUpdateListener(listener);
            tickAnimator.addUpdateListener(new k(icon, view, 1));
            Intrinsics.checkNotNullExpressionValue(tickAnimator, "tickAnimator");
            return tickAnimator;
        }
        ValueAnimator tickAnimator2 = ValueAnimator.ofInt(0);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        tickAnimator2.addUpdateListener(listener);
        tickAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: co.ceduladigital.sdk.o8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SlideToActIconUtil.m20createIconAnimator$lambda1(booleanRef, icon, view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(tickAnimator2, "tickAnimator");
        return tickAnimator2;
    }

    public final Drawable loadIconCompat$slidetoact_release(Context context, int value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = context.getResources().getDrawable(value, context.getTheme());
        Intrinsics.checkNotNullExpressionValue(drawable, "{\n            context.re… context.theme)\n        }");
        return drawable;
    }

    public final void startIconAnimation$slidetoact_release(Drawable icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (icon instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) icon).start();
        } else if (icon instanceof AnimatedVectorDrawableCompat) {
            ((AnimatedVectorDrawableCompat) icon).start();
        }
    }

    public final void stopIconAnimation$slidetoact_release(Drawable icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (icon instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) icon).stop();
        } else if (icon instanceof AnimatedVectorDrawableCompat) {
            ((AnimatedVectorDrawableCompat) icon).stop();
        }
    }

    public final void tintIconCompat$slidetoact_release(Drawable icon, int color) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        icon.setTint(color);
    }
}
