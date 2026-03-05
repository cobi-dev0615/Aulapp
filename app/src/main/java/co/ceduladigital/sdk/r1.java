package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.databinding.ItemClassCardDetailBinding;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class r1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassPracticeBeforeFragment b;

    public /* synthetic */ r1(ClassPracticeBeforeFragment classPracticeBeforeFragment, int i) {
        this.a = i;
        this.b = classPracticeBeforeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassPracticeBeforeFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this$0.b;
                if (classPracticeBeforeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    classPracticeBeforeViewModel = null;
                }
                Context context = this$0.getContext();
                FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = this$0.c;
                Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
                ItemClassCardDetailBinding cardProfileUserProfileUser = fragmentClassPracticeBeforeBinding.cardProfileUserProfileUser;
                Intrinsics.checkNotNullExpressionValue(cardProfileUserProfileUser, "cardProfileUserProfileUser");
                classPracticeBeforeViewModel.showDialog(context, cardProfileUserProfileUser);
                break;
            default:
                ClassPracticeBeforeFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                AlertDialog alertDialog = this$02.n;
                if (alertDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fullDialog");
                    alertDialog = null;
                }
                alertDialog.dismiss();
                break;
        }
    }
}
