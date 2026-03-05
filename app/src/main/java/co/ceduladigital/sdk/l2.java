package co.ceduladigital.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l2 implements NavDirections {
    public final String a;
    public final String b;
    public final ConfigurationSessionDto c;

    public l2(String sessionID, String str, ConfigurationSessionDto configurationSession) {
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
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return Intrinsics.areEqual(this.a, l2Var.a) && Intrinsics.areEqual(this.b, l2Var.b) && Intrinsics.areEqual(this.c, l2Var.c);
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_classPracticeBeforeFragment_to_classInCourseFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("sessionID", this.a);
        bundle.putString("entryTime", this.b);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ConfigurationSessionDto.class);
        Parcelable parcelable = this.c;
        if (isAssignableFrom) {
            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("configurationSession", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(ConfigurationSessionDto.class)) {
            throw new UnsupportedOperationException(ConfigurationSessionDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("configurationSession", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ActionClassPracticeBeforeFragmentToClassInCourseFragment(sessionID=" + this.a + ", entryTime=" + this.b + ", configurationSession=" + this.c + ")";
    }
}
