package pl.droidsonroids.gif;

import android.content.Context;
import com.getkeepsafe.relinker.ReLinker;

/* loaded from: classes2.dex */
public abstract class LibraryLoader {
    private static Context sAppContext;

    private static Context getContext() {
        if (sAppContext == null) {
            try {
                sAppContext = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return sAppContext;
    }

    public static void loadLibrary() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            ReLinker.loadLibrary(getContext(), "pl_droidsonroids_gif");
        }
    }
}
