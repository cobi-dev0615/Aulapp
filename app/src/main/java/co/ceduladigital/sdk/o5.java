package co.ceduladigital.sdk;

import com.gse.aulapp.model.enums.EnumPermissionDevices;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o5 implements PermissionListener, PermissionHelper.Companion.PermissionGrantedListener {
    public final /* synthetic */ FirstLoginFragment a;

    public o5(FirstLoginFragment firstLoginFragment) {
        this.a = firstLoginFragment;
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public final void onPermissionCancel(EnumPermissionDevices p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        int i = n5.$EnumSwitchMapping$0[p1.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        this.a.g(false);
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        FirstLoginFragment firstLoginFragment = this.a;
        String str = firstLoginFragment.a;
        firstLoginFragment.g(false);
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public final void onPermissionGranted() {
        FirstLoginFragment firstLoginFragment = this.a;
        String str = firstLoginFragment.a;
        firstLoginFragment.j();
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        FirstLoginFragment firstLoginFragment = this.a;
        String str = firstLoginFragment.a;
        firstLoginFragment.g(false);
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
        FirstLoginFragment firstLoginFragment = this.a;
        String str = firstLoginFragment.a;
        firstLoginFragment.g(false);
    }
}
