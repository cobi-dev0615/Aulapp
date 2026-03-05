package co.ceduladigital.sdk;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source f(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable h(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ boolean u(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
