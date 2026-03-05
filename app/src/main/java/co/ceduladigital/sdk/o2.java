package co.ceduladigital.sdk;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o2 implements NavDirections {
    public final String a;

    public o2(String urlAction) {
        Intrinsics.checkNotNullParameter(urlAction, "urlAction");
        this.a = urlAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o2) {
            return Intrinsics.areEqual(this.a, ((o2) obj).a) && Intrinsics.areEqual((Object) null, (Object) null);
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_classPracticeBeforeFragment_to_webviewFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("urlAction", this.a);
        bundle.putBoolean("isRegisterFlow", false);
        bundle.putString("toolbarTitle", null);
        return bundle;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 961);
    }

    public final String toString() {
        return q.j(this.a, ", toolbarTitle=null, isRegisterFlow=false)", new StringBuilder("ActionClassPracticeBeforeFragmentToWebviewFragment(urlAction="));
    }
}
