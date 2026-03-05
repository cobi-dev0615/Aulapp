package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import co.ceduladigital.sdk.x5;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
class InvalidationHandler extends Handler {
    private final WeakReference<GifDrawable> mDrawableRef;

    public InvalidationHandler(GifDrawable gifDrawable) {
        super(Looper.getMainLooper());
        this.mDrawableRef = new WeakReference<>(gifDrawable);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        GifDrawable gifDrawable = this.mDrawableRef.get();
        if (gifDrawable == null) {
            return;
        }
        if (message.what == -1) {
            gifDrawable.invalidateSelf();
            return;
        }
        Iterator<Object> it = gifDrawable.mListeners.iterator();
        if (it.hasNext()) {
            throw x5.f(it);
        }
    }
}
