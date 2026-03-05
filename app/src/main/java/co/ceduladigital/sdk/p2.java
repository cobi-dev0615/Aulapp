package co.ceduladigital.sdk;

import android.view.View;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateAndActiveNfc$1;

/* loaded from: classes2.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassPracticeBeforeViewModel b;

    public /* synthetic */ p2(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, int i) {
        this.a = i;
        this.b = classPracticeBeforeViewModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassPracticeBeforeViewModel.validateNfcStatus$lambda$4(this.b, view);
                break;
            case 1:
                ClassPracticeBeforeViewModel.validateNfcStatus$lambda$6(this.b, view);
                break;
            default:
                ClassPracticeBeforeViewModel$validateAndActiveNfc$1.onError$lambda$0(this.b, view);
                break;
        }
    }
}
