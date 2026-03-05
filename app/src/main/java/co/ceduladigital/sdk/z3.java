package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.view.View;
import com.gse.aulapp.util.DialogUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog b;

    public /* synthetic */ z3(AlertDialog alertDialog, int i) {
        this.a = i;
        this.b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                DialogUtil.Companion.showInformationFullDialog$lambda$2(this.b, view);
                break;
            case 1:
                DialogUtil.Companion.showInformationFullDialogBiometricRegistrationResponse$lambda$1(this.b, view);
                break;
            case 2:
                DialogUtil.Companion.showInformationFullDialogError$lambda$4(this.b, view);
                break;
            default:
                DialogUtil.Companion.showInformationFullDialogError$lambda$5(this.b, view);
                break;
        }
    }
}
