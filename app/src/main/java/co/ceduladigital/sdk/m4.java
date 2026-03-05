package co.ceduladigital.sdk;

import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m4 {
    public final UserInfoDto a;

    public m4(UserInfoDto userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.a = userInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4) && Intrinsics.areEqual(this.a, ((m4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FingerPrintBiometricFragmentArgs(userInfo=" + this.a + ")";
    }
}
