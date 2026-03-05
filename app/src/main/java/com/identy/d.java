package com.identy;

import android.graphics.Canvas;
import org.c.a.PngjBadCrcException;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements PngjBadCrcException.values {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ d(e1 e1Var, int i) {
        this.a = i;
        this.b = e1Var;
    }

    @Override // org.c.a.PngjBadCrcException.values
    public final void drawCallback(Canvas canvas) {
        switch (this.a) {
            case 0:
                ((getL2Score) this.b).PngjException(canvas);
                break;
            default:
                ((setFingers) this.b).PngjBadSignature(canvas);
                break;
        }
    }
}
