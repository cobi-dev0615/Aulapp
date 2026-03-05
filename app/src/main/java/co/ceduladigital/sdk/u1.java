package co.ceduladigital.sdk;

import androidx.navigation.NavController;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.karumi.dexter.BuildConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class u1 implements FlowCollector {
    public final /* synthetic */ ClassPracticeBeforeFragment a;

    public u1(ClassPracticeBeforeFragment classPracticeBeforeFragment) {
        this.a = classPracticeBeforeFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Status status = (Status) obj;
        boolean z = status instanceof Status.Loading;
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
        if (z) {
            classPracticeBeforeFragment.callGlobalLoading(((Status.Loading) status).getShow());
        } else if (status instanceof Status.Success) {
            Status.Success success = (Status.Success) status;
            if (success.getData() instanceof String) {
                NavController navController = classPracticeBeforeFragment.o;
                if (navController != null) {
                    String urlAction = (String) success.getData();
                    Intrinsics.checkNotNullParameter(urlAction, "urlAction");
                    navController.navigate(new o2(urlAction));
                }
            } else {
                classPracticeBeforeFragment.callGlobalLoading(false);
                ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, null, BuildConfig.FLAVOR, null, new t1(0), 13);
            }
        } else if (status instanceof Status.Failure) {
            classPracticeBeforeFragment.callGlobalLoading(false);
            ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, null, BuildConfig.FLAVOR, null, new t1(1), 13);
        } else if (status instanceof Status.Exception) {
            classPracticeBeforeFragment.callGlobalLoading(false);
            Status.Exception exception = (Status.Exception) status;
            Object data = exception.getData();
            boolean z2 = data instanceof ErrorResponse;
            String str2 = BuildConfig.FLAVOR;
            if (z2) {
                String message = ((ErrorResponse) exception.getData()).getResult().getMessage();
                if (message == null) {
                    message = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
                }
                String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                if (code != null) {
                    str2 = code;
                }
                str = str2;
                str2 = message;
            } else if (data instanceof String) {
                String str3 = (String) exception.getData();
                str = BuildConfig.FLAVOR;
                str2 = str3;
            } else {
                str = BuildConfig.FLAVOR;
            }
            ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, EnumDialogType.DIALOG_WITH_MESSAGE, str2, str, new t1(2), 8);
        } else {
            classPracticeBeforeFragment.callGlobalLoading(false);
            ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, null, BuildConfig.FLAVOR, null, new t1(3), 13);
        }
        return Unit.INSTANCE;
    }
}
