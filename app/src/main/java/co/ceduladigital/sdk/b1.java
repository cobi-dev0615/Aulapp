package co.ceduladigital.sdk;

import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b1 {
    public final String a;
    public final String b;
    public final ConfigurationSessionDto c;

    public b1(String sessionID, String str, ConfigurationSessionDto configurationSession) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(configurationSession, "configurationSession");
        this.a = sessionID;
        this.b = str;
        this.c = configurationSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.areEqual(this.a, b1Var.a) && Intrinsics.areEqual(this.b, b1Var.b) && Intrinsics.areEqual(this.c, b1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ClassInCourseFragmentArgs(sessionID=" + this.a + ", entryTime=" + this.b + ", configurationSession=" + this.c + ")";
    }
}
