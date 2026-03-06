package co.ceduladigital.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EnumClassType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q7 implements NavDirections {
    public final String a;
    public final EnumClassType b;

    public q7(String sessionID, EnumClassType sessionType) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        this.a = sessionID;
        this.b = sessionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return Intrinsics.areEqual(this.a, q7Var.a) && this.b == q7Var.b;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_practiceClassFragment_to_beforeClassFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("sessionID", this.a);
        bundle.putBoolean("isEnter", false);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(EnumClassType.class);
        Serializable serializable = (Serializable) this.b;
        if (isAssignableFrom) {
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("sessionType", (Parcelable) serializable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(EnumClassType.class)) {
            throw new UnsupportedOperationException(EnumClassType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("sessionType", serializable);
        return bundle;
    }

    public final int hashCode() {
        return this.b.hashCode() + defpackage.a.g(false, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ActionPracticeClassFragmentToBeforeClassFragment(sessionID=" + this.a + ", isEnter=false, sessionType=" + this.b + ")";
    }
}
