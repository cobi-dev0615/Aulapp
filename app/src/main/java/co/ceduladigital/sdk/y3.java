package co.ceduladigital.sdk;

import android.app.Dialog;
import android.view.View;
import com.gse.aulapp.util.DialogNormalUtil;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ y3(Dialog dialog, Function0 function0, int i) {
        this.a = i;
        this.b = dialog;
        this.c = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                DialogNormalUtil.Companion.showDialog$lambda$1(this.b, this.c, view);
                break;
            default:
                DialogNormalUtil.Companion.showDialogCallUserProfile$lambda$4(this.b, this.c, view);
                break;
        }
    }
}
