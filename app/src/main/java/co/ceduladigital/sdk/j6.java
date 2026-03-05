package co.ceduladigital.sdk;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.gse.aulapp.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j6 implements NavDirections {
    public final String a;
    public final String b;

    public j6(String urlAction, String str) {
        Intrinsics.checkNotNullParameter(urlAction, "urlAction");
        this.a = urlAction;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return Intrinsics.areEqual(this.a, j6Var.a) && Intrinsics.areEqual(this.b, j6Var.b);
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_homeFragment_to_webviewFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("urlAction", this.a);
        bundle.putBoolean("isRegisterFlow", false);
        bundle.putString("toolbarTitle", this.b);
        return bundle;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(false) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionHomeFragmentToWebviewFragment(urlAction=");
        sb.append(this.a);
        sb.append(", toolbarTitle=");
        return q.j(this.b, ", isRegisterFlow=false)", sb);
    }
}
