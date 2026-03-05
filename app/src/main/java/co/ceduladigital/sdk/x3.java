package co.ceduladigital.sdk;

import android.app.Dialog;
import android.view.View;
import com.gse.aulapp.util.DialogNormalUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ x3(Dialog dialog, int i) {
        this.a = i;
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                DialogNormalUtil.Companion.showDialog$lambda$0(this.b, view);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
