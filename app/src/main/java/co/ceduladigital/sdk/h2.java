package co.ceduladigital.sdk;

import com.gse.aulapp.model.enums.EnumPermissionDevices;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h2 implements PermissionListener, PermissionHelper.Companion.PermissionGrantedListener {
    public final /* synthetic */ ClassPracticeBeforeFragment a;

    public h2(ClassPracticeBeforeFragment classPracticeBeforeFragment) {
        this.a = classPracticeBeforeFragment;
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public final void onPermissionCancel(EnumPermissionDevices p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        int i = g2.$EnumSwitchMapping$0[p1.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        this.a.callGlobalLoading(false);
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
        String str = classPracticeBeforeFragment.a;
        classPracticeBeforeFragment.callGlobalLoading(false);
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public final void onPermissionGranted() {
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
        String str = classPracticeBeforeFragment.a;
        classPracticeBeforeFragment.g();
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
        String str = classPracticeBeforeFragment.a;
        classPracticeBeforeFragment.callGlobalLoading(false);
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
        String str = classPracticeBeforeFragment.a;
        classPracticeBeforeFragment.callGlobalLoading(false);
    }
}
