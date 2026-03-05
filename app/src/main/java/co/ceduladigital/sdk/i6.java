package co.ceduladigital.sdk;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i6 implements NavDirections {
    public final String a;

    public i6(String instructorID) {
        Intrinsics.checkNotNullParameter(instructorID, "instructorID");
        this.a = instructorID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6) && Intrinsics.areEqual(this.a, ((i6) obj).a);
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_homeFragment_to_rideHistoryFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("instructorID", this.a);
        return bundle;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return q.j(this.a, ")", new StringBuilder("ActionHomeFragmentToRideHistoryFragment(instructorID="));
    }
}
