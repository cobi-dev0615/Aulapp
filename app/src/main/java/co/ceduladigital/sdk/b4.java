package co.ceduladigital.sdk;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b4 {
    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout n(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
