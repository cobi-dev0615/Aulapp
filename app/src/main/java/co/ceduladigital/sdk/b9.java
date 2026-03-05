package co.ceduladigital.sdk;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b9 {
    public static /* synthetic */ WindowInsetsAnimation.Bounds g(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation h(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation i(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void k() {
    }
}
