package co.ceduladigital.sdk;

import android.media.MediaPlayer;
import com.google.zxing.client.android.BeepManager;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        BeepManager.lambda$playBeepSound$0(mediaPlayer);
    }
}
