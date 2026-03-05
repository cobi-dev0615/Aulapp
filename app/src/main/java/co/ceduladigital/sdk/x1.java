package co.ceduladigital.sdk;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x1 implements MenuProvider {
    public final /* synthetic */ ClassPracticeBeforeFragment a;

    public x1(ClassPracticeBeforeFragment classPracticeBeforeFragment) {
        this.a = classPracticeBeforeFragment;
    }

    @Override // androidx.core.view.MenuProvider
    public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
    }

    @Override // androidx.core.view.MenuProvider
    public final boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.a.f();
        return true;
    }
}
