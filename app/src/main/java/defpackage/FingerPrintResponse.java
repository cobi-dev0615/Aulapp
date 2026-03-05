package defpackage;

import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LFingerPrintResponse;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumStatusFingerPrintBiometric;", "statusFingerPrintBiometric", BuildConfig.FLAVOR, "pathDocument", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "hand", "<init>", "(Lcom/gse/aulapp/model/enumerate/EnumStatusFingerPrintBiometric;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Lcom/gse/aulapp/model/enumerate/EnumStatusFingerPrintBiometric;", "getStatusFingerPrintBiometric", "()Lcom/gse/aulapp/model/enumerate/EnumStatusFingerPrintBiometric;", "setStatusFingerPrintBiometric", "(Lcom/gse/aulapp/model/enumerate/EnumStatusFingerPrintBiometric;)V", "Ljava/lang/String;", "getPathDocument", "setPathDocument", "(Ljava/lang/String;)V", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "getHand", "()Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "setHand", "(Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FingerPrintResponse {
    private EnumHandsAulapp hand;
    private String pathDocument;
    private EnumStatusFingerPrintBiometric statusFingerPrintBiometric;

    public FingerPrintResponse(EnumStatusFingerPrintBiometric statusFingerPrintBiometric, String str, EnumHandsAulapp hand) {
        Intrinsics.checkNotNullParameter(statusFingerPrintBiometric, "statusFingerPrintBiometric");
        Intrinsics.checkNotNullParameter(hand, "hand");
        this.statusFingerPrintBiometric = statusFingerPrintBiometric;
        this.pathDocument = str;
        this.hand = hand;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerPrintResponse)) {
            return false;
        }
        FingerPrintResponse fingerPrintResponse = (FingerPrintResponse) other;
        return this.statusFingerPrintBiometric == fingerPrintResponse.statusFingerPrintBiometric && Intrinsics.areEqual(this.pathDocument, fingerPrintResponse.pathDocument) && this.hand == fingerPrintResponse.hand;
    }

    public final EnumStatusFingerPrintBiometric getStatusFingerPrintBiometric() {
        return this.statusFingerPrintBiometric;
    }

    public int hashCode() {
        int hashCode = this.statusFingerPrintBiometric.hashCode() * 31;
        String str = this.pathDocument;
        return this.hand.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "FingerPrintResponse(statusFingerPrintBiometric=" + this.statusFingerPrintBiometric + ", pathDocument=" + this.pathDocument + ", hand=" + this.hand + ")";
    }
}
