package com.identy;

import android.widget.ImageView;
import com.identy.getL2Score;

/* loaded from: classes2.dex */
public final /* synthetic */ class IdentyC implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ IdentyC(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((getL2Score) this.b).getProcessingTime();
                break;
            case 1:
                ((getL2Score) this.b).PngjBadCrcException(6.5f, 5.0f);
                break;
            case 2:
                ((getL2Score) this.b).getFingerPrintQualityScore();
                break;
            default:
                ImageView _iv = (ImageView) this.b; _iv.clearAnimation(); _iv.setVisibility(8);
                break;
        }
    }
}
