package co.ceduladigital.sdk;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.gse.aulapp.util.DialogUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialog b;

    public /* synthetic */ a4(BottomSheetDialog bottomSheetDialog, int i) {
        this.a = i;
        this.b = bottomSheetDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                DialogUtil.Companion.showInformationFullDialogError$lambda$3(this.b, view);
                break;
            default:
                DialogUtil.Companion.showInformationFullDialog$lambda$0(this.b, view);
                break;
        }
    }
}
