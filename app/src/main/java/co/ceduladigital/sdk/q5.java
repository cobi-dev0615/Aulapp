package co.ceduladigital.sdk;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q5 implements NavDirections {
    public final String a;
    public final boolean b;

    public q5(String urlAction, boolean z) {
        Intrinsics.checkNotNullParameter(urlAction, "urlAction");
        this.a = urlAction;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return Intrinsics.areEqual(this.a, q5Var.a) && Intrinsics.areEqual((Object) null, (Object) null) && this.b == q5Var.b;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_firstLoginFragment_to_webviewFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("urlAction", this.a);
        bundle.putBoolean("isRegisterFlow", this.b);
        bundle.putString("toolbarTitle", null);
        return bundle;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 961);
    }

    public final String toString() {
        return "ActionFirstLoginFragmentToWebviewFragment(urlAction=" + this.a + ", toolbarTitle=null, isRegisterFlow=" + this.b + ")";
    }
}
