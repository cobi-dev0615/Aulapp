package co.ceduladigital.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m2 implements NavDirections {
    public final UserInfoDto a;

    public m2(UserInfoDto userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.a = userInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && Intrinsics.areEqual(this.a, ((m2) obj).a);
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_classPracticeBeforeFragment_to_fingerPrintBiometricFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(UserInfoDto.class);
        Parcelable parcelable = this.a;
        if (isAssignableFrom) {
            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("userInfo", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(UserInfoDto.class)) {
            throw new UnsupportedOperationException(UserInfoDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("userInfo", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionClassPracticeBeforeFragmentToFingerPrintBiometricFragment(userInfo=" + this.a + ")";
    }
}
