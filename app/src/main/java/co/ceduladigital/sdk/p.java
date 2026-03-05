package co.ceduladigital.sdk;

import android.media.MediaPlayer;
import com.google.zxing.client.android.BeepManager;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean lambda$playBeepSound$1;
        lambda$playBeepSound$1 = BeepManager.lambda$playBeepSound$1(mediaPlayer, i, i2);
        return lambda$playBeepSound$1;
    }
}
