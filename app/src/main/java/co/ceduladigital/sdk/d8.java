package co.ceduladigital.sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d8 {
    public final String a;

    public d8(String instructorID) {
        Intrinsics.checkNotNullParameter(instructorID, "instructorID");
        this.a = instructorID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8) && Intrinsics.areEqual(this.a, ((d8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return q.j(this.a, ")", new StringBuilder("RideHistoryFragmentArgs(instructorID="));
    }
}
