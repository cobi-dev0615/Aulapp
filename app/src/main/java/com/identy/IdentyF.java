package com.identy;

/* loaded from: classes2.dex */
public final /* synthetic */ class IdentyF implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ setFingers b;

    public /* synthetic */ IdentyF(setFingers setfingers, int i) {
        this.a = i;
        this.b = setfingers;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getData();
                break;
            case 1:
                this.b.getScore();
                break;
            case 2:
                this.b.getQualityScore();
                break;
            case 3:
                this.b.Attempt();
                break;
            default:
                this.b.getFingerPrintQualityScore();
                break;
        }
    }
}
