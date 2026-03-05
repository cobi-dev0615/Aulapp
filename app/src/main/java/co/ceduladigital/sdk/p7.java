package co.ceduladigital.sdk;

import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p7 {
    public final String a;
    public final String b;
    public final ConfigurationSessionDto c;

    public p7(String sessionID, String str, ConfigurationSessionDto configurationSession) {
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
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return Intrinsics.areEqual(this.a, p7Var.a) && Intrinsics.areEqual(this.b, p7Var.b) && Intrinsics.areEqual(this.c, p7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PracticeClassFragmentArgs(sessionID=" + this.a + ", entryTime=" + this.b + ", configurationSession=" + this.c + ")";
    }
}
