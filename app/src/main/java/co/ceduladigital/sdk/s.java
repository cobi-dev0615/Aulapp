package co.ceduladigital.sdk;

import android.content.ClipData;
import android.os.OutcomeReceiver;
import android.os.VibratorManager;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s {
    public static /* bridge */ /* synthetic */ OutcomeReceiver e(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* bridge */ /* synthetic */ VibratorManager h(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }
}
