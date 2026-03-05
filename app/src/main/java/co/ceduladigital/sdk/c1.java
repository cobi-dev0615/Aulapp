package co.ceduladigital.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EnumClassType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c1 implements NavDirections {
    public final String a;
    public final boolean b;
    public final EnumClassType c;

    public c1(String sessionID, boolean z, EnumClassType sessionType) {
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
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.areEqual(this.a, c1Var.a) && this.b == c1Var.b && this.c == c1Var.c;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_classInCourseFragment_to_beforeClassFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("sessionID", this.a);
        bundle.putBoolean("isEnter", this.b);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(EnumClassType.class);
        Serializable serializable = this.c;
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
        return this.c.hashCode() + defpackage.a.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ActionClassInCourseFragmentToBeforeClassFragment(sessionID=" + this.a + ", isEnter=" + this.b + ", sessionType=" + this.c + ")";
    }
}
