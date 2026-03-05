package co.ceduladigital.sdk;

import com.gse.aulapp.model.enumerate.EnumClassType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k2 {
    public final String a;
    public final boolean b;
    public final EnumClassType c;

    public k2(String sessionID, boolean z, EnumClassType sessionType) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        this.a = sessionID;
        this.b = z;
        this.c = sessionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return Intrinsics.areEqual(this.a, k2Var.a) && this.b == k2Var.b && this.c == k2Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + defpackage.a.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ClassPracticeBeforeFragmentArgs(sessionID=" + this.a + ", isEnter=" + this.b + ", sessionType=" + this.c + ")";
    }
}
